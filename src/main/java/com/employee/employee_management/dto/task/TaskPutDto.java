package com.employee.employee_management.dto.task;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskPutDto {
    private String title;
    private String description;
    private boolean completed;
}
