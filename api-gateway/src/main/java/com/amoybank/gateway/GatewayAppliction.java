package com.amoybank.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class GatewayAppliction {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayAppliction.class).web(true).run(args);
    }
}
