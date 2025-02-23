package com.employee.employee_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee_management.dto.employee.EmployeeGetDto;
import com.employee.employee_management.dto.employee.EmployeePostDto;
import com.employee.employee_management.dto.employee.EmployeePutDto;
import com.employee.employee_management.service.EmployeeService;

import lombok.Data;

@Data
@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/api/employees")
    public ResponseEntity<String> insertOne(@RequestBody EmployeePostDto dto) {
        employeeService.insertOne(dto);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @PutMapping("/api/employees/{id}")
    public ResponseEntity<String> updateOne(@PathVariable Long id, @RequestBody EmployeePutDto dto) {
        employeeService.updateOne(id, dto);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @DeleteMapping("/api/employees/{id}")
    public ResponseEntity<String> deleteOne(@PathVariable Long id) {
        employeeService.deleteOne(id);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @GetMapping("/api/employees/{id}")
    public ResponseEntity<EmployeeGetDto> getOne(@PathVariable Long id) {
        EmployeeGetDto employeeGetDto = employeeService.findOne(id);
        return new ResponseEntity<>(employeeGetDto, HttpStatus.OK);
    }
}
