package com.qualteco.food.service;

import com.qualteco.food.dao.EmployeeDao;
import com.qualteco.food.exception.Employee400Exception;
import com.qualteco.food.mapper.EmployeeMapper;
import com.qualteco.food.model.Employee;
import com.qualteco.food.model.Employee_Opt_Out_Table;
import com.qualteco.food.request.AddEmployeeRequest;
import com.qualteco.food.request.EmployeeOptOutRequest;
import com.qualteco.food.response.AddEmployeeResponse;
import com.qualteco.food.response.EmployeeOptOutResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.qualteco.food.mapper.EmployeeOptOutMapper.mapEntityToResponse;
import static com.qualteco.food.mapper.EmployeeOptOutMapper.mapRequestToEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    private EmployeeDao employeeDao;


    @Override
    public AddEmployeeResponse add(AddEmployeeRequest addEmployeeRequest) {
        Optional.ofNullable(addEmployeeRequest).orElseThrow(() -> new Employee400Exception("Invalid employee body"));
        Employee employee = employeeDao.save(EmployeeMapper.mapRequestToEntity(addEmployeeRequest));
        return EmployeeMapper.mapEntityToResponse(employee);
    }

    @Override
    public AddEmployeeResponse getEmployeeId(Integer id) {
        Optional.ofNullable(id).orElseThrow(() -> new Employee400Exception("Invalid employee id " + id));
        Optional<Employee> employee = employeeDao.findById((id));
        return EmployeeMapper.mapEntityToResponse(employee.get());
    }

    @Override
    public List<AddEmployeeResponse> getEmployeeList(Integer merchantId) {
        Optional.ofNullable(merchantId).orElseThrow(() -> new Employee400Exception("Invalid employee id " + merchantId));
        List<Employee> employees = employeeDao.findByMerchantId(merchantId);

        /*List<AddEmployeeResponse> response =  employees.stream().map(emp -> {
            EmployeeMapper.mapEntityToResponse(emp);
        }).collect(Collectors.toList());*/
        return  getResponseList(employees);
    }

    private List<AddEmployeeResponse> getResponseList(List<Employee> employees){
        List<AddEmployeeResponse> addEmployeeResponses = new ArrayList<>();
        for (Employee emp : employees) {
            addEmployeeResponses.add(EmployeeMapper.mapEntityToResponse(emp));
        }
        return addEmployeeResponses;

    }

 /*   @Override
    public EmployeeOptOutResponse updateEmployeeOptOutOrder(EmployeeOptOutRequest employeeOptOutRequest) {
        Optional.ofNullable(employeeOptOutRequest).orElseThrow(()-> new Employee400Exception("Invalid employee opt-out body"));
        Employee_Opt_Out_Table employee_opt_out_table = employeeDao.saveEmpOptOut(mapRequestToEntity(employeeOptOutRequest));
        EmployeeOptOutResponse employeeOptOutResponse = new EmployeeOptOutResponse();
        if(null != employee_opt_out_table){
            employeeOptOutResponse = mapEntityToResponse(employee_opt_out_table);
            employeeOptOutResponse.setStatus("Done");
        }else{

            employeeOptOutResponse.setStatus("Not Done");
        }
        return employeeOptOutResponse;
    }*/
}
