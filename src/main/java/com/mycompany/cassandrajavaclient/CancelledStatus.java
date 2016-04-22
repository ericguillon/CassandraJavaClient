/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandrajavaclient;

import com.datastax.driver.core.Row;

/**
 *
 * @author eric
 */
public class CancelledStatus implements IOperationStatus {

    @Override
    public void update(OperationDAO operationDAO) {
        operationDAO.updateOperationStatus(this);
    }

    @Override
    public void initialize(OperationStatusFactory factory, Row row) {
        factory.initializeOperationStatus(this, row);
    }
    
}
