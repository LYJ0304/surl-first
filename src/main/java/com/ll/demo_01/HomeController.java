package com.ll.demo_01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("a") // http://localhost:8090/a
    @ResponseBody
    public String hello() {
        return "Hello";
    }

    @GetMapping("b")
    @ResponseBody
    public String hello2() {
        return "안녕하세요.";
    }

}
