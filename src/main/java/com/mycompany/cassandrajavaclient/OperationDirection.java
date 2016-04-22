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
public enum OperationDirection {
    debit(-1),
    credit(1);
    
    private final int value;
    private OperationDirection(int value_)
    {
        value = value_;
    }
    
    public int getValue()
    {
        return value;
    }
}
