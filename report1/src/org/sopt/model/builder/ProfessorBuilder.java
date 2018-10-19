package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder extends DepartmentBuilder{
    private int professor_num;
    private String professor_name;
    private String professor_dept;
    private String professor_phone;
    private String professpr_subj;

    public ProfessorBuilder setProfessor_num(int professor_num) {
        this.professor_num = professor_num;
        return this;
    }

    public ProfessorBuilder setProfessor_name(String professor_name) {
        this.professor_name = professor_name;
        return this;
    }

    public ProfessorBuilder setProfessor_dept(String professor_dept) {
        this.professor_dept = professor_dept;
        return this;
    }

    public ProfessorBuilder setProfessor_phone(String professor_phone) {
        this.professor_phone = professor_phone;
        return this;
    }

    public ProfessorBuilder setProfesspr_subj(String professpr_subj) {
        this.professpr_subj = professpr_subj;
        return this;
    }

    public Professor build(){
        return new Professor(super.build().getUniv_num(),super.build().getUniv_name(),super.build().getUniv_phone(),super.build().getUniv_address(),
                super.build().getDepartment_num(),super.build().getDepartment_name(),super.build().getDepartment_phone(),super.build().getDepartment_type(),
                this.professor_num,this.professor_name,this.professor_dept,this.professor_phone,this.professpr_subj);

    }
}
