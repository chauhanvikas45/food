package com.qualteco.food.controller;

import com.qualteco.food.request.AddEmployeeRequest;
import com.qualteco.food.response.AddEmployeeResponse;
import com.qualteco.food.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public ResponseEntity add(@RequestBody AddEmployeeRequest addEmployeeRequest){
        AddEmployeeResponse addEmployeeResponse = employeeService.add(addEmployeeRequest);
        return new ResponseEntity(addEmployeeResponse, HttpStatus.CREATED);

    }
}
