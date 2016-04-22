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
public enum RejectionCode {
    client_status,
    insufficient_balance,
    limit_reached,
    sdd_direct_debit_mandate,
    dcirc_validation,
    aml_validation,
    sab_received_transfer_rejection,
    sab_sdd_direct_debit_rejection
}
