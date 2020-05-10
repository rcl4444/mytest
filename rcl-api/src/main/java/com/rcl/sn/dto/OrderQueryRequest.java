package com.rcl.sn.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderQueryRequest {

    @Data
    public class Snbody {
        OrderQuery orderQuery;
    }

    @Data
    public static class OrderQuery {
        String endTime;

        String orderStatus;

        String startTime;

        String userID;

        String userName;

        Integer pageNo;

        Integer pageSize;
    }

    @JsonProperty("sn_body")
    Snbody body;

    public OrderQueryRequest(final OrderQuery dto) {
        final Snbody newBody = new Snbody();
        newBody.setOrderQuery(dto);
        setBody(newBody);
    }
}