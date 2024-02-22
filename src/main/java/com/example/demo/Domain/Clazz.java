package com.example.demo.Domain;

import java.util.List;

public class Clazz {
    // **クラスと学生リストの準備**：
    // - `Clazz`と`Student`クラスを作成してください。`Clazz`クラスにはクラス名と所属する学生のリストが含まれ、`Student`クラスには学生情報が含まれます
    private int id;
    private String name;
    private List<Student> students;
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
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz [id=" + id + ", name=" + name + ", students=" + students + "]";
    }
    
}
