package com.employee.employee_management.mapper;

import org.springframework.stereotype.Component;

import com.employee.employee_management.dto.employee.EmployeePostDto;
import com.employee.employee_management.dto.employee.EmployeePutDto;
import com.employee.employee_management.model.Employee;

@Component
public class EmployeeMapper {
    public Employee toEmployee(EmployeePostDto dto) {
        return Employee
                .builder()
                .name(dto.getName())
                .departmentId(dto.getDepartmentId())
                .build();
    }

    public Employee toEmployee(Long id, EmployeePutDto dto) {
        return Employee
                .builder()
                .id(id)
                .name(dto.getName())
                .build();
    }
}
