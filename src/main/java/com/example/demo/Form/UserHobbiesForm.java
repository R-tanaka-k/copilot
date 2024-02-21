package com.example.demo.Form;

public class UserHobbiesForm {

    private String name;
    private String hobby;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    @Override
    public String toString() {
        return "UserHobbiesForm [hobby=" + hobby + ", name=" + name + "]";
    }
}
