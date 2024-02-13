package copilot.exercises.ex06.p03;

import java.time.LocalDate;

public class Main {
    // mainメソッドを以下の要件で作成してください
    // - mainメソッドからisOverlappedメソッドを呼び出し、以下の期間が重なっているかどうかを判定してください

    public static void main(String[] args) {
        Period period1 = new Period(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 31));
        Period period2 = new Period(LocalDate.of(2020, 1, 15), LocalDate.of(2020, 2, 15));
        System.out.println(period1.isOverlapped(period2)); // true
    }
}
