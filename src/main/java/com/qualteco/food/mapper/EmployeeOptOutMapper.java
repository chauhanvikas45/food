package com.qualteco.food.mapper;

import com.qualteco.food.model.Employee_Opt_Out_Table;
import com.qualteco.food.request.EmployeeOptOutRequest;
import com.qualteco.food.response.EmployeeOptOutResponse;

import javax.validation.constraints.NotNull;

public class EmployeeOptOutMapper {

    public static Employee_Opt_Out_Table mapRequestToEntity( EmployeeOptOutRequest employeeOptOutRequest){
        Employee_Opt_Out_Table employee_opt_out_table = new Employee_Opt_Out_Table();
        employee_opt_out_table.setEmployee(employeeOptOutRequest.getEmployee());
        employee_opt_out_table.setOptOutFrom(employeeOptOutRequest.getOptOutFrom());
        employee_opt_out_table.setOptOutTo(employeeOptOutRequest.getOptOutTo());
        return employee_opt_out_table;
    }

    public static EmployeeOptOutResponse mapEntityToResponse(Employee_Opt_Out_Table employee_opt_out_table){
        EmployeeOptOutResponse employeeOptOutResponse = new EmployeeOptOutResponse();
        employeeOptOutResponse.setEmployee(employee_opt_out_table.getEmployee());
        employeeOptOutResponse.setOptOutFrom(employee_opt_out_table.getOptOutFrom());
        employeeOptOutResponse.setOptOutTo(employee_opt_out_table.getOptOutTo());
        employeeOptOutResponse.setId(employee_opt_out_table.getId());
        return employeeOptOutResponse;
    }
}
