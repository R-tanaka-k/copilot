package com.example.demo.Domain;

public class Student {
    // **クラスと学生リストの準備**：
    // - `Clazz`と`Student`クラスを作成してください。`Clazz`クラスにはクラス名と所属する学生のリストが含まれ、`Student`クラスには学生情報が含まれます

    private int id;
    private String name;
    private int age;
    private int clazzId;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getClazzId() {
        return clazzId;
    }
    public void setClazzId(int clazzId) {
        this.clazzId = clazzId;
    }   
    
    @Override
    public String toString() {
        return "Student [age=" + age + ", clazzId=" + clazzId + ", id=" + id + ", name=" + name + "]";
    }
}
