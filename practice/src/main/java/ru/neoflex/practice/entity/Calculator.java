package ru.neoflex.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "Calculator")
public class Calculator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private int result;

    public Calculator(int result) {
        this.result = result;
    }

    public Calculator() {
    }
}



