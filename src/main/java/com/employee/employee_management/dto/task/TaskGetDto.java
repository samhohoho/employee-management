package com.employee.employee_management.dto.task;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaskGetDto {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
