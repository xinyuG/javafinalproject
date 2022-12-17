package com.xinyu.javafinalprojectxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class JavafinalprojectxyApplication {
	private static final Logger LOG = LoggerFactory.getLogger(JavafinalprojectxyApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(JavafinalprojectxyApplication.class);
		Environment env = app.run(args).getEnvironment();
		LOG.info("Start!");
		LOG.info("address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
