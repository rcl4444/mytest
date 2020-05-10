package com.rcl;

import com.rcl.sn.ISnApiService;
import com.rcl.sn.dto.OrderDeliveryRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    ISnApiService snApiService;

    @GetMapping("index")
    public String home() {
        snApiService.orderDelivery(new OrderDeliveryRequest(null));
        return "hello";
    }
}