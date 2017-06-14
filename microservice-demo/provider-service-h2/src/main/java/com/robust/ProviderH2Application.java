package com.robust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liubintao on 2017/6/1.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderH2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderH2Application.class, args);
    }
}
