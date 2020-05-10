package com.rcl.sn;

import com.rcl.sn.dto.OrderCodeQueryRequest;
import com.rcl.sn.dto.OrderDeliveryRequest;
import com.rcl.sn.dto.OrderGetRequest;
import com.rcl.sn.dto.OrderQueryRequest;
import com.rcl.sn.vo.OrderCodeQueryResponseVO;
import com.rcl.sn.vo.OrderDeliveryResponseVO;
import com.rcl.sn.vo.OrderGetResponseVO;
import com.rcl.sn.vo.OrderQueryResponseVO;

public interface ISnApiService {

    OrderQueryResponseVO orderQuery(OrderQueryRequest dto);

    OrderCodeQueryResponseVO orderCodeQuery(OrderCodeQueryRequest dto);

    OrderGetResponseVO orderGetQuery(OrderGetRequest dto);

    OrderDeliveryResponseVO orderDelivery(OrderDeliveryRequest dto);
}