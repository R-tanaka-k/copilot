package copilot.exercises.ex08.p01;

public class Student {
    // 生徒とテストの点数を管理するための2つのエンティティクラス（Student）を作成してください。これらのエンティティは、データベースのテーブルにマッピングされるようにします
    private Integer StudentId;
    private String studentName;
    
    public Integer getStudentId() {
        return StudentId;
    }
    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    


}
