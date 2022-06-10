package com.geekwys.apachecamel.components.rest;

import com.geekwys.apachecamel.dto.WeatherDto;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.support.DefaultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RestJavaDsl extends RouteBuilder {

    @Autowired
    private WeatherDataProvider weatherDataProvider;
    @Override
    public void configure() throws Exception {
        from("javadsl/weather/{city}?produces=application/json")
                .process(this::getWeatherData);
    }

    private void getWeatherData(Exchange exchange) {
        String city = exchange.getMessage().getHeader("city", String.class);
        WeatherDto currentWeather = weatherDataProvider.getCurrentWeather(city);

        Message message = new DefaultMessage(exchange.getContext());
        message.setBody(currentWeather);

        exchange.setMessage(message);
    }

}
