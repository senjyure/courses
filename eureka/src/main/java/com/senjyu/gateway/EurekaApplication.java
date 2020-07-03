package com.senjyu.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.ConfigurableEnvironment;


@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    private static final Logger LOG = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        //SpringApplication.run(EurekaApplication.class, args);

        SpringApplication app = new SpringApplication(EurekaApplication.class);

        ConfigurableEnvironment env = app.run(args).getEnvironment();
        LOG.info("启动成功!");
        LOG.info("Eureka地址: \thttp://127.0.0.1:{}",env.getProperty("server.port"));

    }

}

