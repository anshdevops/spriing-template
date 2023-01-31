package com.example.springtemplate.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.springtemplate.pojo.*;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class DemoController {


    @GetMapping ("/custom")
        public String custom() {
            log.info("inside custom() method");
            return "custom";
        }


    @GetMapping ("/test") @ResponseBody
    public Testt testt() {
        log.info("inside testt() method");
        return new Testt("Anshul",27);

    }
}


