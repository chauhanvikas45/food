package com.qualteco.food.service;

import com.qualteco.food.dao.EmployeeDao;
import com.qualteco.food.exception.Employee400Exception;
import com.qualteco.food.mapper.EmployeeMapper;
import com.qualteco.food.model.Employee;
import com.qualteco.food.request.AddEmployeeRequest;
import com.qualteco.food.response.AddEmployeeResponse;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    private EmployeeDao employeeDao;


    @Override
    public AddEmployeeResponse add(AddEmployeeRequest addEmployeeRequest) {
        Optional.ofNullable(addEmployeeRequest).orElseThrow(()-> new Employee400Exception("Invalid employee body"));
        Employee employee = employeeDao.save(EmployeeMapper.mapRequestToEntity(addEmployeeRequest));
        return EmployeeMapper.mapEntityToResponse(employee);
    }

    @Override
    public AddEmployeeResponse getEmployeeId(Integer id) {
        Optional.ofNullable(id).orElseThrow(()-> new Employee400Exception("Invalid employee id "+id));
        Optional<Employee> employee = employeeDao.findById((id));
        return EmployeeMapper.mapEntityToResponse(employee.get());
    }
}
