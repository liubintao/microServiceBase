package com.robust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by liubintao on 2017/6/14.
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignRibbonCustomingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignRibbonCustomingApplication.class, args);
    }
}
