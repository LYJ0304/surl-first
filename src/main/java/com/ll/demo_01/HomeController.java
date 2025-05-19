package com.ll.demo_01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("a") // http://localhost:8090/a
    @ResponseBody
    public String hello(
            String age,
            String id
    ) {
        return "%s번 사람의 나이는 %s살 입니다.".formatted(id, age);
    }

    @GetMapping("b")
    @ResponseBody
    public String plus(
            @RequestParam("a") String num1Str,
            @RequestParam("b")String num2Str
    ) {
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        System.out.println("a = " + num1Str);
        System.out.println("b = " + num2Str);

        return "a + b = %d".formatted(num1 + num2);
    }

}
