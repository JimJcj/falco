package com.amoybank.gateway;

import com.amoybank.gateway.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class GatewayAppliction {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayAppliction.class).web(true).run(args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
