package com.sky.pro.calculate_application.controller;

import com.sky.pro.calculate_application.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("")
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String pluse(@RequestParam(name = "num1") Integer a,
                        @RequestParam(name = "num2") Integer b) {
        return  calculatorService.pluse(a,b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1") Integer a,
                        @RequestParam(name = "num2") Integer b) {
        return calculatorService.minus(a,b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1") Integer a,
                           @RequestParam(name = "num2") Integer b) {
        return calculatorService.multiply(a,b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1") Integer a,
                         @RequestParam(name = "num2") Integer b) {
        return calculatorService.divide(a,b);
    }
}
