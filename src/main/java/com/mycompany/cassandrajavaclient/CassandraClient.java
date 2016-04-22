/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandrajavaclient;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author eric
 */
public class CassandraClient extends Singleton
{
    private CassandraClient()
    {
    }

    private Cluster cluster;
    private Session session;
    private final String keyspace = "java";
    private final String keyspaceCQL = "CREATE KEYSPACE IF NOT EXISTS " + keyspace + " WITH replication " +
                                        "= {'class' : 'SimpleStrategy', 'replication_factor' : 1};";
    private static class SingletonHolder
    {
        private final static CassandraClient instance = new CassandraClient();
    }
    
    public static CassandraClient getInstance()
    {
        return SingletonHolder.instance;
    }
    
    public Session getSession()
    {
        return session;
    }
    
    public void connect(String node)
    {
        cluster = Cluster.builder().addContactPoint(node).build();
        Metadata metadata = cluster.getMetadata();
        System.out.printf("Connected to cluster %s\n", metadata.getClusterName());
        metadata.getAllHosts().stream().forEach((host) -> {
            System.out.printf("Datacenter %s; Host %s; Rack %s\n", host.getDatacenter(), host.getAddress(), host.getRack());
        });
        session = cluster.connect();
    }
    
    public void close()
    {
        session.close();
        cluster.close();
    }
    
    public void createSchema()
    {
        session.execute(keyspaceCQL);
        session.execute("CREATE TABLE IF NOT EXISTS " + keyspace + ".operations (" +
                        "month text," +
                        "iban text," +
                        "id uuid," +
                        "correspondent_iban text," +
                        "status text," +
                        "rejection_cause text," +
                        "custom_fields map<text, text>," +
                        "canal text," +
                        "sub_canal text," +
                        "type text," +
                        "insertion_date timestamp," +
                        "settlement_date timestamp," +
                        "provision_date timestamp," +
                        "on_hold_date timestamp," +
                        "rejection_date timestamp," +
                        "cancellation_date timestamp," +
                        "accounting_date timestamp," +
                        "refunding_date timestamp," +
                        "euro_amount decimal," +
                        "local_amount decimal," +
                        "provisioned_amount decimal," +
                        "rejected_amount decimal," +
                        "refunded_amount decimal," +
                        "accounted_amount decimal," +
                        "transaction_id text," +
                        "message_id text," +
                        "fpe_rejected boolean," +
                        "sab_rejected boolean," +
                        "notify_sab boolean," +
                        "PRIMARY KEY ((month, iban), message_id, transaction_id, id));");
    }
    
    public void getOperations(String month, String iban)
    {
        PreparedStatement statement = session.prepare("SELECT * FROM fpe.operations WHERE month=? AND iban=?;");
        BoundStatement boundStatement = statement.bind(month, iban);
        ResultSet results = session.execute(boundStatement);
        Iterator<Row> iterator = results.iterator();
        while (iterator.hasNext())
        {
            Row row = iterator.next();
            Date settlementDate = row.getTimestamp("required_settlement_date");

            BigDecimal amount = row.getDecimal("euro_required_amount");
            String operationID = row.getString("id");
            System.out.print("Date " + settlementDate + " amount " + amount + " id " + operationID);
        }
    }
    
    public void getClient(String iban)
    {
        PreparedStatement statement = session.prepare("SELECT * FROM fpe.clients WHERE iban=?;");
        BoundStatement boundStatement = statement.bind(iban);
        ResultSet results = session.execute(boundStatement);
        Iterator<Row> iterator = results.iterator();
        while (iterator.hasNext())
        {
            Row row = iterator.next();
            BigDecimal balance = row.getDecimal("balance");
            BigDecimal balanceErp = row.getDecimal("balance_erp");
            System.out.print("Iban " + iban + " balance " + balance + " balance erp " + balanceErp);
        }
    }
    
    public static void main(String[] args)
    {
        CassandraClient client = CassandraClient.getInstance();
        client.connect("127.0.0.1");
        client.getOperations("2016-04", "FR7616598000010080512000116");
        //client.createSchema();
        client.getClient("FR7616598000010133007000115");
        client.close();
    }
}
