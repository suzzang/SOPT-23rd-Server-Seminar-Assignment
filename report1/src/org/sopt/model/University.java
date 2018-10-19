package org.sopt.model;

public class University {
    private int univ_num;
    private String univ_name;
    private String univ_phone;
    private String univ_address;

    public University(int univ_num, String univ_name, String univ_phone, String univ_address) {
        this.univ_num = univ_num;
        this.univ_name = univ_name;
        this.univ_phone = univ_phone;
        this.univ_address = univ_address;
    }

    @Override
    public String toString() {
        return "University{" +
                "univ_num=" + univ_num +
                ", univ_name='" + univ_name + '\'' +
                ", univ_phone='" + univ_phone + '\'' +
                ", univ_address='" + univ_address + '\'' +
                '}';
    }

    public int getUniv_num() {
        return univ_num;
    }

    public void setUniv_num(int univ_num) {
        this.univ_num = univ_num;
    }

    public String getUniv_name() {
        return univ_name;
    }

    public void setUniv_name(String univ_name) {
        this.univ_name = univ_name;
    }

    public String getUniv_phone() {
        return univ_phone;
    }

    public void setUniv_phone(String univ_phone) {
        this.univ_phone = univ_phone;
    }

    public String getUniv_address() {
        return univ_address;
    }

    public void setUniv_address(String univ_address) {
        this.univ_address = univ_address;
    }
}
