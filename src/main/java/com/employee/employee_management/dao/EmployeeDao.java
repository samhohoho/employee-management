package com.employee.employee_management.dao;

import org.apache.ibatis.annotations.Mapper;

import com.employee.employee_management.dto.employee.EmployeeGetDto;
import com.employee.employee_management.model.Employee;

@Mapper
public interface EmployeeDao {
    void insertOne(Employee employee);
    void updateOne(Employee employee);
    EmployeeGetDto findOne(Long id);
    void deleteOne(Long id);
}
