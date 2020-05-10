package com.rcl.sn.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rcl.sn.vo.OrderQueryResponseVO.OrderQuery;

import lombok.Data;


@Data
public class OrderGetResponseVO {
    @Data
    public static class SnBody {
        OrderQuery orderGet;
    }

    @JsonProperty("sn_body")
    SnBody snbody;

    @JsonProperty("sn_error")
    SuningResponse.SnError snerror;
}