package com.amoybank.metric.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/pay1")
    public String pay1() {
        String services = "Services: " + discoveryClient.getServices();
        logger.info(services);
        return services;
    }

}