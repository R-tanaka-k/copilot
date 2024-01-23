package copilot.exercises.ex01.p10;

public class Main {
//     Mainクラスを作成してください
// - mainメソッドの中で以下の処理を実装してください
//   - 整数型の変数 a と b を宣言し、それぞれ 10 と 7 を代入します
//   - a と b の差を求め、結果が偶数ならばその値を2倍して表示し、奇数ならばそのまま表示してください
//     - 条件分岐はまだ使えないので、if文は使わないでください
//     - 代わりに、三項演算子を使ってください
//   - その後、a を1増やし、b を1減らした後の値を表示してください
//     - 代入演算子を使ってください
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        System.out.println((a - b) % 2 == 0 ? (a - b) * 2 : (a - b));
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);
    }
}
