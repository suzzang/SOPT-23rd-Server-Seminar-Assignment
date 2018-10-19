package org.sopt.model;

public class Department extends University {
    private int department_num;
    private String department_name;
    private String department_phone;
    private String department_type;

    @Override
    public String toString() {
        return "Department{" +
                "department_num=" + department_num +
                ", department_name='" + department_name + '\'' +
                ", department_phone='" + department_phone + '\'' +
                ", department_type='" + department_type + '\'' +
                '}';
    }

    public Department(int univ_num, String univ_name, String univ_phone, String univ_address, int department_num, String department_name, String department_phone, String department_type) {
        super(univ_num, univ_name, univ_phone, univ_address);
        this.department_num = department_num;
        this.department_name = department_name;
        this.department_phone = department_phone;
        this.department_type = department_type;
    }

    public int getDepartment_num() {
        return department_num;
    }

    public void setDepartment_num(int department_num) {
        this.department_num = department_num;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDepartment_phone() {
        return department_phone;
    }

    public void setDepartment_phone(String department_phone) {
        this.department_phone = department_phone;
    }

    public String getDepartment_type() {
        return department_type;
    }

    public void setDepartment_type(String department_type) {
        this.department_type = department_type;
    }
}
