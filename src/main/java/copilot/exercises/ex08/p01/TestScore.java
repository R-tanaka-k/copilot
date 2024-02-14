package copilot.exercises.ex08.p01;

public class TestScore {
    // 生徒とテストの点数を管理するための2つのエンティティクラス（TestScore）を作成してください。これらのエンティティは、データベースのテーブルにマッピングされるようにします
    private Integer testId;
    private Integer studentId;
    private String subject;
    private Integer score;
    
    public Integer getTestId() {
        return testId;
    }
    public void setTestId(Integer testId) {
        this.testId = testId;
    }
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }

}
