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
public interface ICommandFactory 
{
    void addCommand(Row row,
                    OperationType type,
                    OperationStatus status,
                    OnHoldOperationHandler handler);
    void addCommand(Row row,
                    OperationType type,
                    OperationStatus status,
                    ProvisionedOperationHandler handler);
    void flush(boolean stop);
}
