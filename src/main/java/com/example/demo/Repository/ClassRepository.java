package com.example.demo.Repository;


import org.springframework.stereotype.Repository;

@Repository

public class ClassRepository {
    //このクラスでは、データベースからクラス情報と所属する学生のリストを取得するメソッドを作成します
    //データベースからクラス情報と所属する学生のリストを取得するメソッドを作成します
    public void findClassList() {
        String sql = "SELECT * FROM class";
    }
}
