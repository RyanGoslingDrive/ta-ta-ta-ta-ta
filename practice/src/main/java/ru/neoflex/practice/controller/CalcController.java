package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import ru.neoflex.practice.entity.Calculator;
import ru.neoflex.practice.repository.CalculationRepository;

import java.util.List;

@RestController
public class CalcController {

    @Autowired
    private CalculationRepository calculationRepository;
    private Calculator calculator;



    @GetMapping("/plus/{a}/{b}")
    public int plus(@PathVariable("a") int a,
                    @PathVariable("b") int b)
    {
        calculator = new Calculator(a+b);
        calculationRepository.save(calculator);
        return a+b;
    }

    @GetMapping("/minus/{a}/{b}")
    public int minus(@PathVariable("a") int a,
                     @PathVariable("b") int b)
    {
        calculator = new Calculator(a-b);
        calculationRepository.save(calculator);
        return a-b;
    }

    @GetMapping("/calculator")
    public List <Calculator> getAllCalculations(){
        return calculationRepository.findAll();
    }











public boolean EvenOrOdd(int number) {
    return number%2 == 0;    }
}