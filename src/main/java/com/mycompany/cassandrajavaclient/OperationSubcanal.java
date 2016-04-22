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
public enum OperationSubcanal {
    mastercard_proxi_payment,
    mastercard_vad_payment,
    mastercard_atm_withdrawal,
    mastercard_counter_withdrawal,
    mastercard_almost_cash,
    sepa_received_transfer,
    sepa_emitted_transfer,
    sepa_sdd_direct_debit,
    sepa_sepa_b2b_direct_debit,
    on_us_fees,
    on_us_various_operations
}
