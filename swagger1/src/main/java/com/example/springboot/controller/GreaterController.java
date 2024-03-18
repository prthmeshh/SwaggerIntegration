package com.example.springboot.controller;

import com.example.springboot.api.GreaterApi;
import com.example.springboot.service.GreaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GreaterController implements GreaterApi {

    @Autowired
    GreaterService service;

    @Override
    public ResponseEntity<Integer> greaterTwoNumbers(Integer firstNumber, Integer secondNumber){
        int result = service.greater(firstNumber,secondNumber);
        return new ResponseEntity<Integer>(result, HttpStatus.OK);

    }

}
