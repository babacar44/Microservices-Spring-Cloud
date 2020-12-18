package com.in28minutes.microservices.limitesservice.controller;

import com.in28minutes.microservices.limitesservice.bean.LimitsConfiguration;
import com.in28minutes.microservices.limitesservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations(){
        return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
