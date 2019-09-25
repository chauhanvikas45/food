package com.qualteco.food.service;

import com.qualteco.food.request.AddEmployeeRequest;
import com.qualteco.food.request.EmployeeOptOutRequest;
import com.qualteco.food.response.AddEmployeeResponse;
import com.qualteco.food.response.EmployeeOptOutResponse;

import java.util.List;

public interface EmployeeService {
    AddEmployeeResponse add(AddEmployeeRequest addEmployeeRequest);

    AddEmployeeResponse getEmployeeId(Integer id);

    List<AddEmployeeResponse> getEmployeeList(Integer merchantId);

    //EmployeeOptOutResponse updateEmployeeOptOutOrder(EmployeeOptOutRequest employeeOptOutRequest);
}
