package com.employee.employee_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.employee_management.dao.TaskDao;
import com.employee.employee_management.dto.task.TaskGetDto;
import com.employee.employee_management.dto.task.TaskPostDto;
import com.employee.employee_management.dto.task.TaskPutDto;
import com.employee.employee_management.mapper.TaskMapper;
import com.employee.employee_management.model.Task;

import lombok.Data;

@Data
@Service
public class TaskService {
    private final TaskDao taskDao;
    private final TaskMapper taskMapper;

    public void insertOne(TaskPostDto dto) {
        Task task = taskMapper.toTask(dto);
        taskDao.insertOne(task);
    }

    public void updateOne(Long id, TaskPutDto dto) {
        Task task = taskMapper.toTask(id, dto);
        taskDao.updateOne(task);
    }

    public List<TaskGetDto> find() {
        return taskDao.findManyTasks();
    }

    public void deleteOne(Long id) {
        taskDao.deleteOne(id);
    }
}
