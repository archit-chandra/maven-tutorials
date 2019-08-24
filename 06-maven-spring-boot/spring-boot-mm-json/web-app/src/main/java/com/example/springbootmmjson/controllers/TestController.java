package com.example.springbootmmjson.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.json.model.ShippingAddress;


@RestController
public class TestController {

    @GetMapping("/")
    public ShippingAddress indexPage(){
        ShippingAddress shippingAddress = new ShippingAddress();
        shippingAddress.setCountryName("India");
        shippingAddress.setAdditionalProperty("state","U.P.");
        shippingAddress.setAdditionalProperty("city","Varanasi");
        return shippingAddress;
    }

}
