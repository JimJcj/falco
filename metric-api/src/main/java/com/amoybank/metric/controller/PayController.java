package com.amoybank.metric.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/pay1")
    public String pay1() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}