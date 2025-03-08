package com.employee.employee_management.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Task {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
