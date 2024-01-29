package copilot.exercises.ex03.p01;

public class Main {
//     フィボナッチ数列を返すメソッド
// - Main クラスを作成してください
// - fibonacciメソッドを以下の要件で作成してください
//   - int 型の引数を受け取ります
//   - 引数で受け取った数値以下のフィボナッチ数列を文字列として返します
// - mainメソッドを以下の要件で作成してください
//   - fibonacciメソッドを使用して、引数が 10 の場合のフィボナッチ数列を表示してください

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static String fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        String result = "0, 1";

        while (c <= n) {
            c = a + b;
            a = b;
            b = c;
            result += ", " + c;
        }

        return result;
    }
}
