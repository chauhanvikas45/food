package com.qualteco.food.dao;

import com.qualteco.food.model.Employee;
import com.qualteco.food.model.Employee_Opt_Out_Table;
import com.qualteco.food.request.EmployeeOptOutRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {

    List<Employee> findByMerchantId(Integer id);
    //Employee_Opt_Out_Table saveEmpOptOut(Employee_Opt_Out_Table employeeOptOutRequest);
}
