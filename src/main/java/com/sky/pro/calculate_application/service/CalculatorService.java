package com.sky.pro.calculate_application.service;

import com.sky.pro.calculate_application.exception.DivisionByZeroException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public int pluse(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    @GetMapping("/multiply")
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}
