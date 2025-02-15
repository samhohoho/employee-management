package com.employee.employee_management.mapper;

import org.springframework.stereotype.Component;

import com.employee.employee_management.dto.department.DepartmentPostDto;
import com.employee.employee_management.dto.department.DepartmentPutDto;
import com.employee.employee_management.model.Department;

@Component
public class DepartmentMapper {
    public Department toDepartment(DepartmentPostDto dto) {
        return Department
                .builder()
                .name(dto.getName())
                .build();
    }

    public Department toDepartment(Long id, DepartmentPutDto dto) {
        return Department
                .builder()
                .id(id)
                .name(dto.getName())
                .build();
    }
}
