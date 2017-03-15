package com.pcf.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AppController {

    @RequestMapping("/hello")
    public String appStartup() {
        return "Starting Spring Boot App!";
    }

}
