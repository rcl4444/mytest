package com.rcl.sn.impl;

import com.rcl.sn.ISnApiService;
import com.rcl.sn.dto.OrderCodeQueryRequest;
import com.rcl.sn.dto.OrderDeliveryRequest;
import com.rcl.sn.dto.OrderGetRequest;
import com.rcl.sn.dto.OrderQueryRequest;
import com.rcl.sn.vo.OrderCodeQueryResponseVO;
import com.rcl.sn.vo.OrderDeliveryResponseVO;
import com.rcl.sn.vo.OrderGetResponseVO;
import com.rcl.sn.vo.OrderQueryResponseVO;

import org.springframework.stereotype.Service;

@Service
public class SnApiService implements ISnApiService {

    @Override
    public OrderQueryResponseVO orderQuery(OrderQueryRequest dto) {
        return null;
    }

    @Override
    public OrderCodeQueryResponseVO orderCodeQuery(OrderCodeQueryRequest dto) {
        return null;
    }

    @Override
    public OrderGetResponseVO orderGetQuery(OrderGetRequest dto) {
        return null;
    }

    @Override
    public OrderDeliveryResponseVO orderDelivery(OrderDeliveryRequest dto) {
        return null;
    }
}