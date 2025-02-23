package com.employee.employee_management.service;

import org.springframework.stereotype.Service;

import com.employee.employee_management.dao.EmployeeDao;
import com.employee.employee_management.dto.employee.EmployeeGetDto;
import com.employee.employee_management.dto.employee.EmployeePostDto;
import com.employee.employee_management.dto.employee.EmployeePutDto;
import com.employee.employee_management.exception.DepartmentNotFoundException;
import com.employee.employee_management.mapper.EmployeeMapper;
import com.employee.employee_management.model.Employee;

import lombok.Data;

@Data
@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;
    private final EmployeeMapper employeeMapper;
    private final DepartmentService departmentService;

    public void insertOne(EmployeePostDto dto) {
        validateDepartment(dto.getDepartmentId());
        Employee employee = employeeMapper.toEmployee(dto);
        employeeDao.insertOne(employee);
    }

    private void validateDepartment(Long departmentId) {
        Boolean exist = departmentService.existById(departmentId);
        if (!exist) {
            throw new DepartmentNotFoundException("Department doesn't exist.");
        }
    }

    public void updateOne(Long id, EmployeePutDto dto) {
        Employee employee = employeeMapper.toEmployee(id, dto);
        employeeDao.updateOne(employee);
    }

    public EmployeeGetDto findOne(Long id) {
        return employeeDao.findOne(id);
    }

    public void deleteOne(Long id) {
        employeeDao.deleteOne(id);
    }
}
