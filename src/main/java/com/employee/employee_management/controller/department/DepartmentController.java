package com.employee.employee_management.controller.department;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee_management.dto.department.DepartmentGetDto;
import com.employee.employee_management.dto.department.DepartmentPostDto;
import com.employee.employee_management.dto.department.DepartmentPutDto;
import com.employee.employee_management.service.DepartmentService;

import lombok.Data;

@Data
@RestController
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping("/api/departments")
    public ResponseEntity<String> insertOne(@RequestBody DepartmentPostDto dto) {
        departmentService.insertOne(dto);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @PutMapping("/api/departments/{id}")
    public ResponseEntity<String> updateOne(@PathVariable Long id, @RequestBody DepartmentPutDto dto) {
        departmentService.updateOne(id, dto);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @DeleteMapping("/api/departments/{id}")
    public ResponseEntity<String> deleteOne(@PathVariable Long id) {
        departmentService.deleteOne(id);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @GetMapping("/api/departments/{id}")
    public ResponseEntity<DepartmentGetDto> getOne(@PathVariable Long id) {
        DepartmentGetDto departmentGetDto = departmentService.findOne(id);
        return new ResponseEntity<>(departmentGetDto, HttpStatus.OK);
    }
}
