package org.sopt.report2.model;


public class User {

    //모델만들때 항상 게터,세터,생성자 꼭 만들어주기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1

    public User(final int user_idx,final String name,final String part) {
        this.user_idx = user_idx;
        this.name = name;
        this.part = part;
    }
    public User(){

    }

    public int getUser_idx() {
        return user_idx;
    }

    public void setUser_idx(int user_idx) {
        this.user_idx = user_idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    private int user_idx;
    private String name;
    private String part;

}
