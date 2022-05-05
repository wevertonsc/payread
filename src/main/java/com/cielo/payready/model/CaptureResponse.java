
package com.cielo.payready.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaptureResponse {

    @JsonProperty("Status")
    private String status;
    @JsonProperty("ReturnCode")
    private String returnCode;
    @JsonProperty("ReturnMessage")
    private String returnMessage;
}
