package com.cardex.microservices.cardexspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CardexSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardexSpringCloudConfigServerApplication.class, args);
    }

}
