package com.employee.employee_management.service;

import org.springframework.stereotype.Service;

import com.employee.employee_management.dao.DepartmentDao;
import com.employee.employee_management.dto.department.DepartmentGetDto;
import com.employee.employee_management.dto.department.DepartmentPostDto;
import com.employee.employee_management.dto.department.DepartmentPutDto;
import com.employee.employee_management.mapper.DepartmentMapper;
import com.employee.employee_management.model.Department;

import lombok.Data;

@Data
@Service
public class DepartmentService {
    private final DepartmentDao departmentDao;
    private final DepartmentMapper departmentMapper;

    public void insertOne(DepartmentPostDto dto) {
        Department department = departmentMapper.toDepartment(dto);
        departmentDao.insertOne(department);
    }

    public void updateOne(Long id, DepartmentPutDto dto) {
        Department department = departmentMapper.toDepartment(id, dto);
        departmentDao.updateOne(department);
    }

    public DepartmentGetDto findOne(Long id) {
        return departmentDao.findOne(id);
    }

    public void deleteOne(Long id) {
        departmentDao.deleteOne(id);
    }

    public boolean existById(Long id) {
        return departmentDao.existById(id);
    }
}
