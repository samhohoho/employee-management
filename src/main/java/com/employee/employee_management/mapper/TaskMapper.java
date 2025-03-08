package com.employee.employee_management.mapper;

import org.springframework.stereotype.Component;

import com.employee.employee_management.dto.task.TaskPostDto;
import com.employee.employee_management.dto.task.TaskPutDto;
import com.employee.employee_management.model.Task;

@Component
public class TaskMapper {
    public Task toTask(TaskPostDto dto) {
        return Task.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .completed(dto.isCompleted())
                .build();
    }

    public Task toTask(Long id, TaskPutDto dto) {
        return Task.builder()
                .id(id)
                .title(dto.getTitle())
                .description(dto.getDescription())
                .completed(dto.isCompleted())
                .build();
    }
}
