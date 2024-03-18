package com.example.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class GreaterServiceImpl implements GreaterService{

    @Override
    public int greater(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

}
