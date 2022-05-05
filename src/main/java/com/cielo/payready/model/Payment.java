package com.cielo.payready.model;

import com.cielo.payready.model.enums.CardType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
@JsonRootName("Payment")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment {

    @JsonProperty("Type")
    private CardType type;
    @JsonProperty("Amount")
    private Long amount;
    @JsonProperty("Installments")
    private Integer installments;
    @JsonProperty("SoftDescriptor")
    private String softDescriptor;
    @JsonProperty("CreditCard")
    private CreditCard creditCard;
    @JsonProperty("DebitCard")
    private DebitCard debitCard;
    @JsonProperty("RecurrentPayment")
    private RecurrentPayment recurrentPayment;

    @JsonProperty("ServiceTaxAmount")
    private Integer serviceTaxAmount;
    @JsonProperty("Interest")
    private String interest;
    @JsonProperty("Capture")
    private Boolean capture;
    @JsonProperty("Authenticate")
    private Boolean authenticate;
    @JsonProperty("ProofOfSale")
    private String proofOfSale;
    @JsonProperty("Tid")
    private String tid;
    @JsonProperty("AuthorizationCode")
    private String authorizationCode;
    @JsonProperty("PaymentId")
    private String paymentId;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Status")
    private Integer status;
    @JsonProperty("ReturnCode")
    private String returnCode;
    @JsonProperty("ReturnMessage")
    private String returnMessage;
    @JsonProperty("ReturnUrl")
    private String returnUrl;

}
