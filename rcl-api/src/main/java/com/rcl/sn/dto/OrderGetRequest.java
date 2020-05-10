package com.rcl.sn.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderGetRequest {

    @Data
    public static class OrderGet {
        String orderCode;

        public OrderGet(String orderCode) {
            this.orderCode = orderCode;
        }
    }

    @Data
    public static class Snbody {
        OrderGet orderGet;
    }

    @JsonProperty("sn_body")
    Snbody body;

    public OrderGetRequest(String orderCode) {
        Snbody newBody = new Snbody();
        newBody.setOrderGet(new OrderGet(orderCode));
        setBody(newBody);
    }
}