package com.robust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by liubintao on 2017/6/13.
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableCircuitBreaker
public class ConsumerFeignAMQPApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignAMQPApplication.class, args);
    }
}
