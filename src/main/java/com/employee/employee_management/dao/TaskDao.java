package com.employee.employee_management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.employee.employee_management.dto.task.TaskGetDto;
import com.employee.employee_management.model.Task;

@Mapper
public interface TaskDao {
    void insertOne(Task task);
    void updateOne(Task task);
    List<TaskGetDto> find();
    void deleteOne(Long id);
}
