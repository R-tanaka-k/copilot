package copilot.exercises.ex01.p08;

public class Main {
    // Mainクラスを作成してください
    // - mainメソッドの中で以下の処理を実装してください
    //   - 整数型の変数 number を宣言し、初期値として 8 を代入します
    //   - number を3回インクリメントして、その後2回デクリメントしてください
    //   - 最終的に number の値を表示してください
    public static void main(String[] args) {
        int number = 8;
        number++;
        number++;
        number++;
        number--;
        number--;
        System.out.println(number);
    }
}
