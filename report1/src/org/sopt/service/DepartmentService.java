package org.sopt.service;

import org.sopt.model.Department;

public interface DepartmentService {

    Department getByDepartmentName(final String department_name);
}
