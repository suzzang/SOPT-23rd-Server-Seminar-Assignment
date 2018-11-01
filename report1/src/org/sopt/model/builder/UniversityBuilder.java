package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {
    private int univ_num;
    private String univ_name;
    private String univ_phone;
    private String univ_address;

    public UniversityBuilder setUniv_num(int univ_num) {
        this.univ_num = univ_num;
        return this;
    }

    public UniversityBuilder setUniv_name(String univ_name) {
        this.univ_name = univ_name;
        return this;
    }

    public UniversityBuilder setUniv_phone(String univ_phone) {
        this.univ_phone = univ_phone;
        return this;
    }

    public UniversityBuilder setUniv_address(String univ_address) {
        this.univ_address = univ_address;
        return this;
    }

    public University build() {
        return new University(this.univ_num, this.univ_name, this.univ_phone, this.univ_address);
    }
}
