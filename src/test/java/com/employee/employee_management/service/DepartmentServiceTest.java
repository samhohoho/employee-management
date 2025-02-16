package com.employee.employee_management.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.employee.employee_management.dao.DepartmentDao;
import com.employee.employee_management.dto.department.DepartmentGetDto;

@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTest {
    @Mock
    private DepartmentDao departmentDao;

    @InjectMocks
    private DepartmentService departmentService;

    @Test
    public void find_one_success() {
        DepartmentGetDto expectedDepartment = DepartmentGetDto
                .builder()
                .id(1L)
                .name("Department1")
                .build();
        when(departmentDao.findOne(1L)).thenReturn(expectedDepartment);
        DepartmentGetDto actualDepartment = departmentService.findOne(1L);

        assertEquals(expectedDepartment.getId(), actualDepartment.getId());
        assertEquals(expectedDepartment.getName(), actualDepartment.getName());
    }
}
