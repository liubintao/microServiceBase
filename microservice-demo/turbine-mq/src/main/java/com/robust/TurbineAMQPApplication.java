package com.robust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbineStream
public class TurbineAMQPApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(TurbineAMQPApplication.class, args);
    }
}
