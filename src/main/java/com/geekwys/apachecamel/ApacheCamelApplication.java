package com.geekwys.apachecamel;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.geekwys"})
public class ApacheCamelApplication {

	@Autowired
	ProducerTemplate producerTemplate;

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ApacheCamelApplication.class, args);
	}

}
