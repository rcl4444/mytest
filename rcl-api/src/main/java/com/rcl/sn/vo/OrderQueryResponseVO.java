package com.rcl.sn.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderQueryResponseVO extends SelectSuningResponse {

    @Data
    public static class PaymentList {
        String banktypecode;

        String merchantPercent;

        String offLinePayFlag;

        String payamount;

        String paycode;

        String alipayPayNo;

        String platformPercent;
    }

    @Data
    public static class ActivityType {
        String activityTypeCode;
    }

    @Data
    public static class OrderChannel {
        String orderChannelCode;
    }

    @Data
    public static class PayType {
        String payTypeCode;
    }

    @Data
    public static class DonationProjectInfo {
        String donationProjectId;

        String donationAmt;
    }

    @Data
    public static class PopContractInfo {
        String contractDealType;

        String selectedNum;

        String carrieroperator;

        String setMealName;

        Double monthlyFee;

        String contractPeriod;

        String countrywideFlow;

        String nativeFlow;

        String speechTime;

        String messageAmt;

        String returnFeeRule;

        String feeDetails;

        String monthlyFeeName;

        String monthlyFeeContent;

        String name;

        String phoneNum;

        String cardNum;

        String cardAddress;

        String installName;

        String installPhoneNum;

        String installAddress;

        String remark;

        String frontPhoto;

        String backPhoto;

        String facePhoto;
    }

    @Data
    public static class OrderDetail {
        String activitytype;

        List<ActivityType> activityTypes;

        String bLineNumber;

        String carShopAddr;

        String carShopCode;

        String carShopName;

        String carShopSerWay;

        String carShopTel;

        List<CouponList> couponList;

        double coupontotalMoney;

        double declareGoodsAmount;

        double declareItemPrice;

        double declareItemTaxfare;

        double depositmoney;

        String disType;

        String expresscompanycode;

        String expressno;

        String fpsdeliveryflag;

        String hwgFlag;

        String invCode;

        String isProsupplierDelivery;

        String itemCode;

        double itemTaxFare;

        String mode;

        String orderchannel;

        List<OrderChannel> orderChannels;

        String orderLineNumber;

        String orderLineStatus;

        String orderServiceTypeMulti;

        String otoOrderType;

        String packageorderid;

        double payAmount;

        String payerCustomerName;

        String payerIdNumber;

        List<PaymentList> paymentList;

        String payorderid;

        List<PayType> payTypes;

        String phoneIdentifyCode;

        String prmtcode;

        String productCode;

        String productName;

        String receivezipCode;

        List<DonationProjectInfo> donationProjectInfo;

        String rentperiod;

        String renttype;

        double reservebalanceamount;

        double reservedepositamount;

        String reservestatus;

        String returnOrderFlag;

        double saleNum;

        double transportFee;

        String serviceItemFlag;

        double unitPrice;

        double vouchertotalMoney;

        String otoStoreCode;

        String otoStoreName;

        double expandAmount;

        String refVerifyCode;
    }

    @Data
    public static class CouponList {
        String coupontype;

        String sharelimit;
    }

    @Data
    public static class OrderQuery {
        String account;

        String bank;

        String buyerOrdRemark;

        String cityCode;

        String cityName;

        String customerAddress;

        String customerName;

        String districtCode;

        String districtName;

        String evaluationMark;

        String invoice;

        String invoiceHead;

        String invoiceRecipientAddress;

        String invoiceRecipientHandPhone;

        String invoiceRecipientName;

        String invoiceRecipientPhone;

        String invoiceType;

        String mobNum;

        String needinvoiceflag;

        String orderCode;

        List<OrderDetail> orderDetail;

        String orderSaleTime;

        String orderTotalStatus;

        Double payTotalAmount;

        String payType;

        String provinceCode;

        String provinceName;

        String registerAddress;

        String registerPhone;

        String sellerOrdRemark;

        String userName;

        String vatTaxpayerNumber;
    }

    @Data
    public static class SnBody {
        List<OrderQuery> orderQuery;
    }

    @JsonProperty("sn_body")
    SnBody snbody;

    @JsonProperty("sn_head")
    SelectSuningResponse.SnHead snhead;

    @JsonProperty("sn_error")
    SuningResponse.SnError snerror;
}