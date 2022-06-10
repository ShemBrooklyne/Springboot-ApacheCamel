package com.geekwys.apachecamel.components.rest;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestJavaDsl extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("javadsl/weather/{city}?produces=application/json")
                .process();
    }

}
