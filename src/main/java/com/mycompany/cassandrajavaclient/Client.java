/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandrajavaclient;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

/**
 *
 * @author eric
 */
public class Client {
    String iban;
    AccountStatus status;
    UUID revisionId;
    Set<String> correspondentWhitelist;
    Set<String> correspondentsToAuthorize;
    BigDecimal balance;
    BigDecimal balanceErp;
    BigDecimal balanceLimit;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public UUID getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(UUID revisionId) {
        this.revisionId = revisionId;
    }

    public Set<String> getCorrespondentWhitelist() {
        return correspondentWhitelist;
    }

    public void setCorrespondentWhitelist(Set<String> correspondentWhitelist) {
        this.correspondentWhitelist = correspondentWhitelist;
    }

    public Set<String> getCorrespondentsToAuthorize() {
        return correspondentsToAuthorize;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalanceErp() {
        return balanceErp;
    }

    public void setBalanceErp(BigDecimal balanceErp) {
        this.balanceErp = balanceErp;
    }

    public BigDecimal getBalanceLimit() {
        return balanceLimit;
    }

    public void setBalanceLimit(BigDecimal balanceLimit) {
        this.balanceLimit = balanceLimit;
    }
    
    public void authorizeCorrespondent(String iban){
        correspondentsToAuthorize.add(iban);
    }
}
