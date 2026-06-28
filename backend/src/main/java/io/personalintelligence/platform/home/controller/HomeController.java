package io.personalintelligence.platform.home.controller;


import io.personalintelligence.platform.shared.dto.ApiInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HomeController {

    @GetMapping("/")
    public ApiInfo getHome() {

        ApiInfo apiInfo = ApiInfo.builder()
                .name("PIP")
                .version("1.0.0")
                .status("RUNNING")
                .timestamp(LocalDateTime.now())
                .build();

        return apiInfo;
    }
}