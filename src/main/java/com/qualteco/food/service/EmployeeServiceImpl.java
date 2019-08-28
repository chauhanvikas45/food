package com.qualteco.food.service;

import com.qualteco.food.dao.EmployeeDao;
import com.qualteco.food.exception.Employee400Exception;
import com.qualteco.food.request.AddEmployeeRequest;
import com.qualteco.food.response.AddEmployeeResponse;

import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    private EmployeeDao employeeDao;


    @Override
    public AddEmployeeResponse add(AddEmployeeRequest addEmployeeRequest) {
        Optional.ofNullable(addEmployeeRequest).orElseThrow(()-> new Employee400Exception("Invalid employee body"));
        //AddEmployeeResponse addEmployeeResponse = employeeDao.save(addEmployeeRequest);
        return null;
    }
}
