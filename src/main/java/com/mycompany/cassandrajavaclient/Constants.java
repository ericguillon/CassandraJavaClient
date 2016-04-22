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
public class Constants 
{
    public static final String XML_DOCUMENT = "Document";

    //Direct debit rejection A1P
    public static final String ORIGINAL_GROUP_INFO_AND_STATUS = "OrgnlGrpInfAndSts";
    public static final String ORIGINAL_GROUP_INFO = "OrgnlGrpInf";
    public static final String ORIGINAL_MESSAGE_ID = "OrgnlMsgId";

    public static final String PAYMENT_STATUS_REPORT = "FIToFIPmtStsRpt";
    public static final String TRANSACTION_INFORMATION_AND_STATUS = "TxInfAndSts";

    public static final String ORIGINAL_END_TO_END_ID = "OrgnlEndToEndId";
    public static final String ORIGINAL_TRANSACTION_ID = "OrgnlTxId";
    public static final String ORIGINAL_TRANSACTION_REFERENCE = "OrgnlTxRef";

    //#Direct debit
    public static final String FI_TO_FI_CUSTOMER_DIRECT_DEBIT = "FIToFICstmrDrctDbt";
    public static final String DIRECT_DEBIT_TRANSACTION_INFORMATION = "DrctDbtTxInf";

    public static final String PAYMENT_ID = "PmtId";
    public static final String TRANSACTION_ID = "TxId";
    public static final String END_TO_END_ID = "EndToEndId";
    public static final String INSTRUCTION_ID = "InstrId";
    public static final String RETURN_IDENTIFICATION = "RtrId";
    public static final String CANCELLATION_IDENTIFICATION = "CxlId";
    public static final String CANCELLATION_STATUS_IDENTIFICATION = "CxlStsId";
    public static final String CANCELLATION_STATUS_REASON_INFORMATION = "CxlStsRsnInf";
    public static final String STATUS_IDENTIFICATION = "StsId";

    public static final String HEADER = "GrpHdr";
    public static final String MESSAGE_ID = "MsgId";
    public static final String NUMBER_OF_TX = "NbOfTxs";
    public static final String INTERBANK_SETTLEMENT_DATE = "IntrBkSttlmDt";
    public static final String CREATION_DATE = "CreDtTm";
    public static final String ORIGINAL_INTERBANK_SETTLEMENT_DATE = "OrgnlIntrBkSttlmDt";

    public static final String INTERBANK_SETTLEMENT_AMOUNT = "IntrBkSttlmAmt";
    public static final String ORIGINAL_INTERBANK_SETTLEMENT_AMOUNT = "OrgnlIntrBkSttlmAmt";
    public static final String RETURNED_INTERBANK_SETTLEMENT_AMOUNT = "RtrdIntrBkSttlmAmt";
    public static final String TOTAL_INTERBANK_SETTLEMENT_AMOUNT = "TtlIntrBkSttlmAmt";
    public static final String TOTAL_RETURNED_INTERBANK_SETTLEMENT_AMOUNT = "TtlRtrdIntrBkSttlmAmt";
    public static final String SETTLEMENT_CURRENCY = "@Ccy";
    public static final String SETTLEMENT_VALUE = "#text";

    public static final String CREDITOR = "Cdtr";
    public static final String DEBTOR = "Dbtr";
    public static final String CREDITOR_ACCOUNT = "CdtrAcct";
    public static final String DEBTOR_ACCOUNT = "DbtrAcct";
    public static final String INSTRUCTED_AGENT = "InstdAgt";
    public static final String INSTRUCTING_AGENT = "InstgAgt";
    public static final String CREDITOR_AGENT = "CdtrAgt";
    public static final String DEBTOR_AGENT = "DbtrAgt";
    public static final String FINANCIAL_INSTITUTION_ID = "FinInstnId";
    public static final String ID = "Id";
    public static final String IBAN = "IBAN";
    public static final String BIC = "BIC";
    public static final String NAME = "Nm";
    public static final String POSTAL_ADDRESS = "PstlAdr";
    public static final String COUNTRY = "Ctry";

    public static final String REQUESTED_COLLECTION_DATE = "ReqdColltnDt";
    public static final String STATUS_REASON_INFORMATION = "StsRsnInf";
    public static final String RETURN_REASON_INFORMATION = "RtrRsnInf";
    public static final String REASON = "Rsn";
    public static final String CODE = "Cd";

    //received transfer
    public static final String FI_TO_FI_CUSTOMER_CREDIT_TRANSFER = "FIToFICstmrCdtTrf";
    public static final String CREDIT_TRANSFER_TRANSACTION_INFORMATION = "CdtTrfTxInf";

    //received transfer rejection
    public static final String PAYMENT_RETURN = "PmtRtr";
    public static final String TRANSACTION_INFORMATION = "TxInf";

    //recall
    public static final String FI_TO_FI_PAYMENT_CANCELLATION_REQUEST = "FIToFIPmtCxlReq";
    public static final String ASSIGNMENT = "Assgnmt";
    public static final String UNDERLYING = "Undrlyg";
    public static final String ASSIGNER = "Assgnr";
    public static final String ASSIGNEE = "Assgne";
    public static final String AGENT = "Agt";
    public static final String CONTROL_DATA = "CtrlData";
    public static final String CANCELLATION_REASON_INFORMATION = "CxlRsnInf";
    public static final String PROPRIETARY = "Prtry";
    public static final String ADDITIONAL_INFORMATION = "AddtlInf";

    public static final String RESOLUTION_OF_INVESTIGATION = "RsltnOfInvstgtn";
    public static final String CANCELLATION_DETAILS = "CxlDtls";

    //partial recall
    public static final String CHARGES_INFORMATION = "ChrgsInf";
    public static final String CHARGES_AMOUNT = "Amt";
    public static final String RETURNED_INSTRUCTED_AMOUNT = "RtrdInstdAmt";

    public static final String FI_TO_FI_PAYMENT_REVERSAL = "FIToFIPmtRvsl";
    public static final String TOTAL_REVERSED_INTERBANK_SETTLEMENT_AMOUNT = "TtlRvsdIntrBkSttlmAmt";
    public static final String REVERSAL_IDENTIFICATION = "RvslId";
    public static final String REVERSED_INTERBANK_SETTLEMENT_AMOUNT = "RvsdIntrBkSttlmAmt";
    public static final String REVERSAL_REASON_INFORMATION = "RvslRsnInf";

    public static final String DATE_ISO_FORMAT = "YYYY-mm-DDTHH:MM:SS";
    public static final String DATE_STRING_FORMAT = "YYYY-mm-DD";
    public static final String MONTH_STRING_FORMAT = "YYYY-mm";
}
