package com.amoybank.paymetiry.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PayMetricController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/paymetric")
    public String dc() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("pay-metric-api");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/pay1";
        logger.info(url);
        return restTemplate.getForObject(url, String.class);
    }
}