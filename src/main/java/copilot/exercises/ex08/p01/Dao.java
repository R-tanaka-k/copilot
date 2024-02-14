package copilot.exercises.ex08.p01;

import java.util.List;


public class Dao {
// DAO（Data Access Object）クラスを作成し、それぞれのエンティティに対するデータベース操作を行うメソッドを実装してください。但し、以下の「Main内の指示」で必要となるメソッドのみでかまいません
// - データベースへの接続やクエリの実行にはJDBCとPreparedStatementを使用してください。また適切なエラーハンドリングを含めてください



    public void insertStudent(Student student) {
   
    }

    public void insertTestScore(TestScore testScore) {
        // テストの点数をデータベースに登録するメソッドを実装してください
    }

    public void updateStudent(Student student) {
        // 生徒情報をデータベースで更新するメソッドを実装してください
    }

    public void updateTestScore(TestScore testScore) {
        // テストの点数をデータベースで更新するメソッドを実装してください
    }

    public void deleteStudent(Integer studentId) {
        // 生徒情報をデータベースから削除するメソッドを実装してください
    }

    public void deleteTestScore(Integer testId) {
        // テストの点数をデータベースから削除するメソッドを実装してください
    }

    public Student selectStudent(Integer studentId) {
        // 生徒情報をデータベースから取得するメソッドを実装してください
        return null;
    }

    public TestScore selectTestScore(Integer testId) {
        // テストの点数をデータベースから取得するメソッドを実装してください
        return null;
    }

    public List<Student> selectAllStudents() {
        // 全ての生徒情報をデータベースから取得するメソッドを実装してください
        return null;
    }

    public List<TestScore> selectAllTestScores() {
        // 全てのテストの点数をデータベースから取得するメソッドを実装してください
        return null;
    }
}
