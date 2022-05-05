package com.cielo.payready.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
@JsonRootName("RecurrentPayment")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecurrentPayment {
    @JsonProperty("RecurrentPaymentId")
    private String recurrentPaymentId;

    @JsonProperty("AuthorizeNow")
    private boolean authorizeNow;

    @JsonProperty("EndDate")
    private String endDate;

    @JsonProperty("Interval")
    private String interval;

    @JsonProperty("ReasonCode")
    private int reasonCode;
}
