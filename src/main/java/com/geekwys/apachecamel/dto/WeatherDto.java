package com.geekwys.apachecamel.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDto {
    static Integer counter = 1;
    private String city;
    private String temp;
    private String unit;
    private String receivedTime;
    private Integer id = counter++;
}
