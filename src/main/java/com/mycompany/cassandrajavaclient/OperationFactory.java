/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandrajavaclient;

/**
 *
 * @author eric
 */
public class OperationFactory extends Factory<Operation> {
    final OperationStatusFactory operationStatusFactory;
    public OperationFactory(OperationStatusFactory factory)
    {
        operationStatusFactory = factory;
    }
    
    public Operation getOperation()
    {
        Operation operation = get();
        if (operation == null)
        {
            operation = new Operation();
        }
        return operation;
    }
}
