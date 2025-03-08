package com.employee.employee_management.dto.task;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskPostDto {
    @NotNull
    private String title;
    private String description;
    private boolean completed = false;
}
