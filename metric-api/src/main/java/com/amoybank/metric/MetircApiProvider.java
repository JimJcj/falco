package com.amoybank.metric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MetircApiProvider {
    public static void main(String[] args) {
        SpringApplication.run(MetircApiProvider.class, args);
    }
}