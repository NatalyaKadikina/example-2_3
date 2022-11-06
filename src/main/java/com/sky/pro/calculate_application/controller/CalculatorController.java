package com.sky.pro.calculate_application.controller;

import com.sky.pro.calculate_application.exception.DivisionByZeroException;
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
    public int pluse(@RequestParam(name = "num1") Integer a,
                        @RequestParam(name = "num2") Integer b) {
        return  calculatorService.pluse(a,b);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam(name = "num1") Integer a,
                        @RequestParam(name = "num2") Integer b) {
        return calculatorService.minus(a,b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam(name = "num1") Integer a,
                           @RequestParam(name = "num2") Integer b) {
        return calculatorService.multiply(a,b);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam(name = "num1") Integer a,
                         @RequestParam(name = "num2") Integer b) {
        return calculatorService.divide(a,b);
    }
}
