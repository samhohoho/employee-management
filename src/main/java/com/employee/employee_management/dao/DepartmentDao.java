package com.employee.employee_management.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.employee.employee_management.dto.department.DepartmentGetDto;
import com.employee.employee_management.model.Department;

@Mapper
public interface DepartmentDao {
    void insertOne(Department department);
    void updateOne(Department department);
    DepartmentGetDto findOne(Long id);
    void deleteOne(Long id);

    boolean existById(Long id);
}
