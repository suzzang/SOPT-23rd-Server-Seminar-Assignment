package org.sopt.model;

public class Student extends Department {
    private int student_num;
    private String student_name;
    private int student_grade;
    private String student_dept;
    private String student_email;
    private String student_address;
    private int student_age;
    private String student_state;

    public Student(int univ_num, String univ_name, String univ_phone, String univ_address, int department_num, String department_name, String department_phone, String department_type, int student_num, String student_name, int student_grade, String student_dept, String student_email, String student_address, int student_age, String student_state) {
        super(univ_num, univ_name, univ_phone, univ_address, department_num, department_name, department_phone, department_type);
        this.student_num = student_num;
        this.student_name = student_name;
        this.student_grade = student_grade;
        this.student_dept = student_dept;
        this.student_email = student_email;
        this.student_address = student_address;
        this.student_age = student_age;
        this.student_state = student_state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_num=" + student_num +
                ", student_name='" + student_name + '\'' +
                ", student_grade=" + student_grade +
                ", student_dept='" + student_dept + '\'' +
                ", student_email='" + student_email + '\'' +
                ", student_address='" + student_address + '\'' +
                ", student_age=" + student_age +
                ", student_state='" + student_state + '\'' +
                '}';
    }



    public int getStudent_num() {
        return student_num;
    }

    public void setStudent_num(int student_num) {
        this.student_num = student_num;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_grade() {
        return student_grade;
    }

    public void setStudent_grade(int student_grade) {
        this.student_grade = student_grade;
    }

    public String getStudent_dept() {
        return student_dept;
    }

    public void setStudent_dept(String student_dept) {
        this.student_dept = student_dept;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public String getStudent_address() {
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_age(int student_age) {
        this.student_age = student_age;
    }

    public String getStudent_state() {
        return student_state;
    }

    public void setStudent_state(String student_state) {
        this.student_state = student_state;
    }
}
