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
public enum EventType {
    sepa_integration,
    sepa_settlement_date,
    sepa_aml_validation,
    sepa_dcirc_validation,
    sepa_erp_integration,
    balance_event,
    balance_erp_event,
    user_cancellation,
    sepa_refund,
    sepa_cancellation,
    sab_cancellation,
    sab_rejection
}
