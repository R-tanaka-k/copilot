package copilot.exercises.ex06.p02;

public class Main {
    // mainメソッドを以下の要件で作成してください
    // - ①LocalDateクラスを使って、今日の日付を「例）2023年12月31日」のフォーマットで出力してください
    // - ②徳仁天皇の誕生日は、1960年2月23日です。徳仁天皇が生まれてから、今日で何年何ヶ月何日経過したかを出力してください
    public static void main(String[] args) {
        // ①
        // ここにコードを追加してください
        System.out.println(java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy年M月d日")));

        // ②
        // ここにコードを追加してください
        java.time.LocalDate birthday = java.time.LocalDate.of(1960, 2, 23);
        java.time.Period period = java.time.Period.between(birthday, java.time.LocalDate.now());
        System.out.println(period.getYears() + "年" + period.getMonths() + "ヶ月" + period.getDays() + "日");
    }
}
