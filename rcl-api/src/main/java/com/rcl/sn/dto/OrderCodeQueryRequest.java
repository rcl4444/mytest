package com.rcl.sn.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderCodeQueryRequest {

    @Data
    public static class Snbody {
        OrderCodeQuery orderCodeQuery;
    }

    @Data
    public static class OrderCodeQuery {
        String startTime;

        String endTime;

        String orderStatus;
    }

    @JsonProperty("sn_body")
    Snbody body;

    public OrderCodeQueryRequest(OrderCodeQuery dto) {
        Snbody newBody = new Snbody();
        newBody.setOrderCodeQuery(dto);
        setBody(newBody);
    }
}