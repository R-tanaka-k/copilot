package copilot.exercises.ex02.p05;

public class Main {
    // 九九の表を逆順で表示する
    // - Mainクラスを作成してください
    // - mainメソッドの中で以下の処理を実装してください
    //   - 九九の表を逆順で表示するプログラムを作成してください
    //   - String.formatやSystem.out.printfは使用しないでください

    public static void main(String[] args) {
        int total = 0;
        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j >= 1; j--) {
                total = i * j;
            if(total < 10){
                System.out.print(" " + total + " ");
            }else{
                System.out.print(total + " ");
            }
        }System.out.println();
    }
}
    
}
