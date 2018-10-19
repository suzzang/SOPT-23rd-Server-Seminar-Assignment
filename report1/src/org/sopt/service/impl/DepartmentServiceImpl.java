package org.sopt.service.impl;

import org.sopt.model.Department;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public Department getByDepartmentName(String department_name) {
        DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        Department department = departmentBuilder.build();
        return department;
    }
}
