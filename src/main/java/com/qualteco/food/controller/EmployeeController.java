package com.qualteco.food.controller;

import com.qualteco.food.request.AddEmployeeRequest;
import com.qualteco.food.request.EmployeeOptOutRequest;
import com.qualteco.food.response.AddEmployeeResponse;
import com.qualteco.food.response.EmployeeOptOutResponse;
import com.qualteco.food.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = "Application/json")
    public ResponseEntity add(@RequestBody AddEmployeeRequest addEmployeeRequest){
        AddEmployeeResponse addEmployeeResponse = employeeService.add(addEmployeeRequest);
        return new ResponseEntity(addEmployeeResponse, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = "Application/json")
    public ResponseEntity getEmployee(@PathVariable("id") Integer id){
        AddEmployeeResponse addEmployeeResponse = employeeService.getEmployeeId(id);
        return new ResponseEntity(addEmployeeResponse, HttpStatus.OK);
    }

  /*  @RequestMapping(value = "/optOut",method = RequestMethod.PUT,produces = "Application/json")
    public ResponseEntity getEmployeeOptOut(@RequestBody EmployeeOptOutRequest employeeOptOutRequest){
        EmployeeOptOutResponse  employeeOptOutResponse= employeeService.updateEmployeeOptOutOrder(employeeOptOutRequest);
        return new ResponseEntity(employeeOptOutResponse, HttpStatus.OK);
    }*/

    @RequestMapping(value = "customer/{customerId}",method = RequestMethod.GET,produces = "Application/json")
    public ResponseEntity getEmployeeList(@PathVariable("customerId") Integer merchantId){
        List<AddEmployeeResponse> addEmployeeResponse = employeeService.getEmployeeList(merchantId);
        return new ResponseEntity(addEmployeeResponse, HttpStatus.OK);
    }


}
