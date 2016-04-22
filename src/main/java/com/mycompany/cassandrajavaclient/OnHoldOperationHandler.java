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
public class OnHoldOperationHandler implements IOperationHandler {
    final ICommandFactory commandFactory;
    public OnHoldOperationHandler(ICommandFactory factory)
    {
        commandFactory = factory;
    }
    
    @Override
    public void onResultAvailable(Row row, OperationType type, OperationStatus status) {
        commandFactory.addCommand(row, type, status, this);
    }

    @Override
    public void flush() {
        commandFactory.flush(false);
    }
    
}
