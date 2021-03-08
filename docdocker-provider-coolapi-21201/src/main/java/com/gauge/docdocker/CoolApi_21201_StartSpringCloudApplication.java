package com.gauge.docdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
public class CoolApi_21201_StartSpringCloudApplication {
    public static void main(String[] args) {

        SpringApplication.run(CoolApi_21201_StartSpringCloudApplication.class, args);
    }
}

//
//public class CoolApi_21201_StartSpringCloudApplication
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}
