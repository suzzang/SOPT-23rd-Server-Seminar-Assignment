package org.sopt.model.builder;

import org.sopt.model.Department;
import org.sopt.model.Student;

public class StudentBuilder extends DepartmentBuilder {
    private int student_num;
    private String student_name;
    private int student_grade;
    private String student_dept;
    private String student_email;
    private String student_address;
    private int student_age;
    private String student_state;

    public StudentBuilder setStudent_num(int student_num) {
        this.student_num = student_num;
        return this;
    }

    public StudentBuilder setStudent_name(String student_name) {
        this.student_name = student_name;
        return this;
    }

    public StudentBuilder setStudent_grade(int student_grade) {
        this.student_grade = student_grade;
        return this;
    }

    public StudentBuilder setStudent_dept(String student_dept) {
        this.student_dept = student_dept;
        return this;
    }

    public StudentBuilder setStudent_email(String student_email) {
        this.student_email = student_email;
        return this;
    }

    public StudentBuilder setStudent_address(String student_address) {
        this.student_address = student_address;
        return this;
    }

    public StudentBuilder setStudent_age(int student_age) {
        this.student_age = student_age;
        return this;
    }

    public StudentBuilder setStudent_state(String student_state) {
        this.student_state = student_state;
        return this;
    }

    public Student build() {
        return new Student(super.build().getUniv_num(), super.build().getUniv_name(), super.build().getUniv_phone(), super.build().getUniv_address(),
                super.build().getDepartment_num(), super.build().getDepartment_name(), super.build().getDepartment_phone(), super.build().getDepartment_type(),
                this.student_num, this.student_name, this.student_grade, this.student_dept, this.student_email, this.student_address, this.student_age, this.student_state);
    }
}
