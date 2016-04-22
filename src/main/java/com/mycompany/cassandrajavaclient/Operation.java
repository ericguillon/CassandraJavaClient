/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandrajavaclient;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author eric
 */
public class Operation 
{
    BigDecimal amount;
    BigDecimal fee;
    BigDecimal authorizedAmount;
    
    String id;
    String transactionId;
    String realTransactionId;
    String messageId;
    String realMessageId;
    String technicalLabel;
    
    OperationCanal canal;
    OperationSubcanal subCanal;
    OperationType type;
    OperationDirection direction;
    
    IOperationStatus status;
    
    Date insertionDate;
    Date settlementDate;
    
    Account[] accounts = new Account[AccountType.end.ordinal()];
    
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getAuthorizedAmount() {
        return authorizedAmount;
    }

    public void setAuthorizedAmount(BigDecimal authorizedAmount) {
        this.authorizedAmount = authorizedAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getRealTransactionId() {
        return realTransactionId;
    }

    public void setRealTransactionId(String realTransactionId) {
        this.realTransactionId = realTransactionId;
    }

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

    public String getTechnicalLabel() {
        return technicalLabel;
    }

    public void setTechnicalLabel(String technicalLabel) {
        this.technicalLabel = technicalLabel;
    }

    public OperationCanal getCanal() {
        return canal;
    }

    public void setCanal(OperationCanal canal) {
        this.canal = canal;
    }

    public OperationSubcanal getSubCanal() {
        return subCanal;
    }

    public void setSubCanal(OperationSubcanal subCanal) {
        this.subCanal = subCanal;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public OperationDirection getDirection() {
        return direction;
    }

    public void setDirection(OperationDirection direction) {
        this.direction = direction;
    }

    public IOperationStatus getStatus() {
        return status;
    }

    public void setStatus(IOperationStatus status) {
        this.status = status;
    }

    public Date getInsertionDate() {
        return insertionDate;
    }

    public void setInsertionDate(Date insertionDate) {
        this.insertionDate = insertionDate;
    }

    public Date getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Date settlementDate) {
        this.settlementDate = settlementDate;
    }
    
    public Account getClientAccount()
    {
        return accounts[AccountType.client.ordinal()];
    }
    
    public Account getCorrespondentAccount()
    {
        return accounts[AccountType.correspondent.ordinal()];
    }
}
