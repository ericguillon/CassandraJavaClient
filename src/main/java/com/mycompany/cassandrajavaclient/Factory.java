/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandrajavaclient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eric
 * @param <T>
 */
public class Factory<T> {
    private final List<T> values;

    public Factory() {
        this.values = new ArrayList();
    }
    
    public T get()
    {
        T value = null;
        if (!values.isEmpty())
        {
            value = values.remove(0);
        }
        return value;
    }
    
    public void release (T value)
    {
        values.add(value);
    }
}
