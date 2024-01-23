package ru.neoflex.practice.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalcControllerTest {

    @Test
    void minus() {
        CalcController calcController = new CalcController();
        int minus = calcController.minus(10, 15);
        Assertions.assertEquals(25, minus);
    }

    @Test
    void plus() {
        CalcController calcController = new CalcController();
        int plus = calcController.plus(10, 15);
        Assertions.assertEquals(25, plus);
    }


    private CalcController calcController;
    @BeforeEach
    void setUp() {
        calcController = new CalcController();
    }


    @Test
    void EvenOrOdd_EvenNumber() {
        boolean even = calcController.EvenOrOdd(10);
        Assertions.assertTrue(even);
    }

    @Test
    void EvenOrOdd_OddNumber() {
        boolean Odd = calcController.EvenOrOdd(10);
        Assertions.assertFalse(Odd);
    }
}