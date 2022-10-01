package com.sky.pro.calculate_application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public String pluse(int a, int b) {
        int result = a + b;
        return a + " + " + b + " = " + result;
    }

    public String minus(int a, int b) {
        int result = a - b;
        return a + " - " + b + " = " + result;
    }

    @GetMapping("/multiply")
    public String multiply(int a, int b) {
        int result = a * b;
        return a + " * " + b + " = " + result;
    }

    public String divide(int a, int b) {
        int result = a / b;
        return a + " / " + b + " = " + result;
    }
}
