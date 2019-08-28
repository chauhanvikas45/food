package com.qualteco.food.service;

import com.qualteco.food.request.AddEmployeeRequest;
import com.qualteco.food.response.AddEmployeeResponse;

public interface EmployeeService {
    AddEmployeeResponse add(AddEmployeeRequest addEmployeeRequest);
}
