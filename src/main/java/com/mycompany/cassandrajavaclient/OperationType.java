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
public enum OperationType 
{
    card_payment,
    card_payment_refund,
    card_payment_cancellation,
    unpaid_card_payment,
    atm_withdrawal,
    atm_withdrawal_refund,
    atm_withdrawal_cancellation,
    unpaid_atm_withdrawal,
    counter_withdrawal,
    counter_withdrawal_refund,
    counter_withdrawal_cancellation,
    unpaid_counter_withdrawal,
    quasi_cash,
    quasi_cash_refund,
    quasi_cash_cancellation,
    quasi_cash_unpaid,
    sepa_received_transfer_operation,
    sepa_received_transfer_rejection,
    sepa_received_transfer_refund,
    sepa_received_transfer_cancellation,
    sepa_emitted_transfer_operation,
    sepa_emitted_transfer_rejection,
    sepa_emitted_transfer_refund,
    sepa_emitted_transfer_cancellation,
    sepa_sdd_direct_debit_operation,
    sepa_sdd_direct_debit_rejection,
    sepa_sdd_direct_debit_refund,
    sepa_sdd_direct_debit_cancellation,
    sepa_b2b_direct_debit_operation,
    sepa_b2b_direct_debit_rejection,
    on_us_subscription,
    on_us_subscription_deposit,
    on_us_transfer,
    on_us_deposit,
    on_us_withdrawal,
    on_us_payment,
    on_us_fees_replacement,
    on_us_fees_on_demand,
    on_us_fees_yearly_subscription,
    on_us_fees_sms_agreement,
    on_us_fees_search,
    on_us_fees_irregular_use,
    on_us_fees_other,
    on_us_various_refund,
    end
}
