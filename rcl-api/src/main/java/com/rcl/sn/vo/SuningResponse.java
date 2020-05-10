package com.rcl.sn.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

public class SuningResponse {

    @Data
    public static class SnError {
        @JsonProperty("error_code")
        String errorCode;

        @JsonProperty("error_msg")
        String errorMsg;
    }
}
