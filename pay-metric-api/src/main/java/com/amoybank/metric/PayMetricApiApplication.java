package com.amoybank.metric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PayMetricApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayMetricApiApplication.class, args);
    }
}