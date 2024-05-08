package com.green.appec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//5_8_1
@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @GetMapping("/getArr")
    public String[] getArr() {
        return new String[]{"AAA","BBB","CCC"};
    }

}
