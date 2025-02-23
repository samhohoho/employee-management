package com.employee.employee_management.dto.employee;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmployeeGetDto {
    private Long id;
    private String name;
    private Long departmentId;
}
