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
public class RejectedStatus implements IOperationStatus {
    RejectionCode code;
    String cause;
    boolean fpeRejected;
    boolean sabRejected;
    boolean notifySab;
    
    public RejectedStatus()
    {
        code = RejectionCode.client_status;
        fpeRejected = false;
        sabRejected = false;
        notifySab = false;
    }
    
    @Override
    public void update(OperationDAO operationDAO) {
        operationDAO.updateOperationStatus(this);
    }

    @Override
    public void initialize(OperationStatusFactory factory, Row row) {
        factory.initializeOperationStatus(this, row);
    }

    public RejectionCode getCode() {
        return code;
    }

    public void setCode(RejectionCode code) {
        this.code = code;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public boolean isFpeRejected() {
        return fpeRejected;
    }

    public void setFpeRejected(boolean fpeRejected) {
        this.fpeRejected = fpeRejected;
    }

    public boolean isSabRejected() {
        return sabRejected;
    }

    public void setSabRejected(boolean sabRejected) {
        this.sabRejected = sabRejected;
    }

    public boolean isNotifySab() {
        return notifySab;
    }

    public void setNotifySab(boolean notifySab) {
        this.notifySab = notifySab;
    }

}
