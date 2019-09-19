package com.qualteco.food.mapper;

import com.qualteco.food.constant.Category;
import com.qualteco.food.constant.WeekDays;
import com.qualteco.food.model.Employee;
import com.qualteco.food.model.Food_Menu;
import com.qualteco.food.request.AddEmployeeRequest;
import com.qualteco.food.request.AddFoodRequest;
import com.qualteco.food.response.AddEmployeeResponse;

public class EmployeeMapper {

    public static Employee mapRequestToEntity(AddEmployeeRequest addEmployeeRequest){
        Employee employee = new Employee();
        employee.setEmployeeName(addEmployeeRequest.getEmployeeName());
        employee.setEmployeeNumber(addEmployeeRequest.getEmployeeNumber());
        employee.setMerchant(addEmployeeRequest.getMerchant());
        employee.setEmployee_opt_out_table(addEmployeeRequest.getEmployee_opt_out_table());
        employee.setEmployee_order_details(addEmployeeRequest.getEmployee_order_details());
        return employee;
    }

    public static AddEmployeeResponse mapEntityToResponse(Employee employee){
        AddEmployeeResponse addEmployeeResponse = new AddEmployeeResponse();
        addEmployeeResponse.setEmployeeName(employee.getEmployeeName());
        addEmployeeResponse.setEmployeeNumber(employee.getEmployeeNumber());
        addEmployeeResponse.setMerchant(employee.getMerchant());
        addEmployeeResponse.setEmployee_opt_out_table(employee.getEmployee_opt_out_table());
        addEmployeeResponse.setEmployee_order_details(employee.getEmployee_order_details());
        return addEmployeeResponse;
    }
}
