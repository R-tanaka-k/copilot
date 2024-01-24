package copilot.exercises.ex02.p04;

public class Main {
    // リバースピラミッドを作成する
    // - Mainクラスを作成してください
    // - mainメソッドの中で以下の処理を実装してください
    //   - forループを使用して、以下のような逆さピラミッドを出力してください
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
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
