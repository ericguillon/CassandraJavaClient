/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandrajavaclient;

import org.w3c.dom.Document;

/**
 *
 * @author eric
 */
public interface IListener {
    public void onDocumentAvailable(Document document);
}
