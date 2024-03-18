package com.example.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionServiceImpl implements AdditionService{

    @Override
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
