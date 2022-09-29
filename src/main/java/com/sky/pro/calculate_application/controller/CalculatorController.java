package com.sky.pro.calculate_application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController {

    @GetMapping("/calculator")
    public String calculator()
    {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/calculator/plus")
    public String pluse(@RequestParam(name = "num1") Integer a,
                        @RequestParam(name = "num2") Integer b)
    {
        int result = a + b;
        return a + " + " + b +" = " + result;
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam(name = "num1") Integer a,
                        @RequestParam(name = "num2") Integer b)
    {
        int result = a - b;
        return a + " - " + b +" = " + result;
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam(name = "num1") Integer a,
                        @RequestParam(name = "num2") Integer b)
    {
        int result = a * b;
        return a + " * " + b +" = " + result;
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam(name = "num1") Integer a,
                           @RequestParam(name = "num2") Integer b)
    {
        int result = a / b;
        return a + " / " + b +" = " + result;
    }
}
