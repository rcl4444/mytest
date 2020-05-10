package com.rcl.sn.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
public class OrderDeliveryRequest {
    @Data
    @AllArgsConstructor
    public static class OrderLineNumber {
        String orderLineNumber;
    }

    @Data
    @Builder
    public static class PhoneIdentifyCode {
        String orderLineNumber;

        String phoneIdentifyCode;

        String productCode;
    }

    @Data
    @AllArgsConstructor
    public static class SendDetail {
        String productCode;
    }

    @Data
    @Builder
    public static class OrderDelivery {
        String deliveryTime;

        @NotEmpty
        String expressCompanyCode;

        @NotEmpty
        String expressNo;

        @NotEmpty
        String orderCode;

        OrderLineNumber orderLineNumbers;

        List<PhoneIdentifyCode> phoneIdentifyCodes;

        SendDetail sendDetail;
    }

    @Data
    public static class Snbody {
        OrderDelivery orderDelivery;
    }

    @JsonProperty("sn_body")
    Snbody body;

    public OrderDeliveryRequest(OrderDelivery orderDelivery) {
        Snbody newBody = new Snbody();
        newBody.setOrderDelivery(orderDelivery);
        setBody(newBody);
    }
}