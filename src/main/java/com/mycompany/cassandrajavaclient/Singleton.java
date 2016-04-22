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
public class Singleton {
    protected Singleton()
    {}
    
    private static class SingletonHolder
    {
        private final static Singleton instance = new Singleton();
    }
    
    public static Singleton getInstance()
    {
        return SingletonHolder.instance;
    }
}
