package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder extends UniversityBuilder {
    private int department_num;
    private String department_name;
    private String department_phone;
    private String department_type;

    public DepartmentBuilder setDepartment_num(int department_num) {
        this.department_num = department_num;
        return this;
    }

    public DepartmentBuilder setDepartment_name(String department_name) {
        this.department_name = department_name;
        return this;
    }

    public DepartmentBuilder setDepartment_phone(String department_phone) {
        this.department_phone = department_phone;
        return this;
    }

    public DepartmentBuilder setDepartment_type(String department_type) {
        this.department_type = department_type;
        return this;
    }

    public Department build() {
        return new Department(super.build().getUniv_num(), super.build().getUniv_name(), super.build().getUniv_phone(), super.build().getUniv_address(), this.department_num, this.department_phone, this.department_phone, this.department_type);
    }
}
