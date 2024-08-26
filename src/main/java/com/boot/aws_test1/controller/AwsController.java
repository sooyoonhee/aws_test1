package com.boot.aws_test1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AwsController {

    @GetMapping("/aws/v1")
    public String hello(){
        log.info("/aws.v1이 호출되었어요.");

        return "<h1>aws v1 호출 </h1>";
    }
}
