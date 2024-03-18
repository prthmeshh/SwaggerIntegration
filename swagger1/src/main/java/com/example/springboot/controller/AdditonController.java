package com.example.springboot.controller;

import com.example.springboot.api.AddApi;
import com.example.springboot.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class AdditonController implements AddApi {

    @Autowired
    AdditionService service;

    @Override
    public ResponseEntity<Integer> addTwoNumbers(Integer firstNumber,Integer secondNumber){
        int result = service.add(firstNumber,secondNumber);
        return new ResponseEntity<Integer>(result, HttpStatus.OK);

    }

}
