package com.evil.ibet_core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("test")
    public String test() {
        return "hello";
    }
}
