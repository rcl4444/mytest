package com.rcl.sn.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderCodeQueryResponseVO {
    @Data
    public static class SnBody {
        List<String> orderCode;
    }

    @JsonProperty("sn_body")
    SnBody snbody;

    @JsonProperty("sn_error")
    SuningResponse.SnError snerror;
}