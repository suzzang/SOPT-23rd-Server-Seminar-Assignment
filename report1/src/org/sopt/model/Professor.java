package org.sopt.model;

public class Professor extends Department {
    private int professor_num;
    private String professor_name;
    private String professor_dept;
    private String professor_phone;
    private String professpr_subj;

    @Override
    public String toString() {
        return "Professor{" +
                "professor_num=" + professor_num +
                ", professor_name='" + professor_name + '\'' +
                ", professor_dept='" + professor_dept + '\'' +
                ", professor_phone='" + professor_phone + '\'' +
                ", professpr_subj='" + professpr_subj + '\'' +
                '}';
    }

    public Professor(int univ_num, String univ_name, String univ_phone, String univ_address, int department_num, String department_name, String department_phone, String department_type, int professor_num, String professor_name, String professor_dept, String professor_phone, String professpr_subj) {
        super(univ_num, univ_name, univ_phone, univ_address, department_num, department_name, department_phone, department_type);
        this.professor_num = professor_num;
        this.professor_name = professor_name;
        this.professor_dept = professor_dept;
        this.professor_phone = professor_phone;
        this.professpr_subj = professpr_subj;
    }

    public int getProfessor_num() {
        return professor_num;
    }

    public void setProfessor_num(int professor_num) {
        this.professor_num = professor_num;
    }

    public String getProfessor_name() {
        return professor_name;
    }

    public void setProfessor_name(String professor_name) {
        this.professor_name = professor_name;
    }

    public String getProfessor_dept() {
        return professor_dept;
    }

    public void setProfessor_dept(String professor_dept) {
        this.professor_dept = professor_dept;
    }

    public String getProfessor_phone() {
        return professor_phone;
    }

    public void setProfessor_phone(String professor_phone) {
        this.professor_phone = professor_phone;
    }

    public String getProfesspr_subj() {
        return professpr_subj;
    }

    public void setProfesspr_subj(String professpr_subj) {
        this.professpr_subj = professpr_subj;
    }
}

