package com.rcl.sn.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 订单发货
 * 
 * @author raochenglong
 * @Date 2020/05/09
 */
@Data
public class OrderDeliveryResponseVO {
    @Data
    public static class SendDetail {
        /**
         * 订单号
         */
        String orderCode;

        /**
         * 订单行项目号
         */
        String orderLineNumber;

        /**
         * 苏宁商品编码
         */
        String productCode;

        /**
         * 发货结果
         */
        String sendresult;
    }

    @Data
    public static class OrderDelivery {
        List<SendDetail> sendDetail;
    }

    @Data
    public static class SnBody {
        OrderDelivery orderDelivery;
    }

    @JsonProperty("sn_body")
    SnBody snbody;

    @JsonProperty("sn_error")
    SuningResponse.SnError snerror;
}