package com.employee.employee_management.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee_management.dto.task.TaskGetDto;
import com.employee.employee_management.dto.task.TaskPostDto;
import com.employee.employee_management.dto.task.TaskPutDto;
import com.employee.employee_management.service.TaskService;

import jakarta.validation.Valid;
import lombok.Data;

@Data
@RestController
public class TaskController {
    private final TaskService taskService;

    @PostMapping("/api/tasks")
    public ResponseEntity<String> insertOne(@Valid @RequestBody TaskPostDto dto) {
        taskService.insertOne(dto);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @PutMapping("/api/tasks/{id}")
    public ResponseEntity<String> updateOne(@PathVariable Long id, @RequestBody TaskPutDto dto) {
        taskService.updateOne(id, dto);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @DeleteMapping("/api/tasks/{id}")
    public ResponseEntity<String> deleteOne(@PathVariable Long id) {
        taskService.deleteOne(id);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @GetMapping("/api/tasks")
    public ResponseEntity<List<TaskGetDto>> getOne() {
        List<TaskGetDto> tasks = taskService.find();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }
}
