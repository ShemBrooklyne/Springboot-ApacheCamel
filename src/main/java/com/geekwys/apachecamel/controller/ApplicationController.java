package com.geekwys.apachecamel.controller;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class ApplicationController extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration()
                .component("servlet")
                .port(8080)
                .host("localhost")
                .bindingMode(RestBindingMode.json);
    }
}
