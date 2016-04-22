/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandrajavaclient;

import com.datastax.driver.core.Row;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eric
 */
public class OperationStatusFactory {
    final List<IOperationStatus> operationStatuses;
    
    OperationStatusFactory()
    {
        operationStatuses = new ArrayList<>();
        operationStatuses.add(new ReservedStatus());
        operationStatuses.add(new OnHoldStatus());
        operationStatuses.add(new ProvisionedStatus());
        operationStatuses.add(new AccountedStatus());
        operationStatuses.add(new CancelledStatus());
        operationStatuses.add(new RejectedStatus());
    }
    
    public <T> void initializeOperationStatus(T status, Row row)
    {
    }
    
    public void initializeOperationStatus(RejectedStatus status, Row row)
    {
        
    }
    
    IOperationStatus getOperationStatus(OperationStatus status)
    {
        return operationStatuses.get(status.ordinal());
    }
}
