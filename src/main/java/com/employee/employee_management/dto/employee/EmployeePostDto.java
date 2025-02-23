package com.employee.employee_management.dto.employee;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class EmployeePostDto {
    private String name;
    private Long departmentId;
}
