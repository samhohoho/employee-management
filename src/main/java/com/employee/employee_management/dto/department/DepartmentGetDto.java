package com.employee.employee_management.dto.department;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DepartmentGetDto {
    private Long id;
    private String name;
}
