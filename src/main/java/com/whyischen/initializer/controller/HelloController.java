package com.whyischen.initializer.controller;

import com.whyischen.initializer.demo.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@AllArgsConstructor
public class HelloController {

    private final DemoService demoService;

    @GetMapping("hello")

    public String hello() {
        demoService.hello();
        return "Hello World!";
    }


}
