package copilot.exercises.ex02.p03;

public class Main {
    // ピラミッドを作成する
    // - Mainクラスを作成してください
    // - mainメソッドの中で以下の処理を実装してください
    //   - forループを使用して、以下のようなピラミッドを出力してください
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

    
}
