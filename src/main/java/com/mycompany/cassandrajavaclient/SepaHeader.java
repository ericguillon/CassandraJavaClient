/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandrajavaclient;

import java.util.Date;

/**
 *
 * @author eric
 */
public class SepaHeader {
    String messageId;
    String realMessageId;
    Date creationDate;
    Date settlementDate;
    
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getRealMessageId() {
        return realMessageId;
    }

    public void setRealMessageId(String realMessageId) {
        this.realMessageId = realMessageId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Date settlementDate) {
        this.settlementDate = settlementDate;
    }
}
