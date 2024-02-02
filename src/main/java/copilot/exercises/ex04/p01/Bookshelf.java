package copilot.exercises.ex04.p01;

public class Bookshelf {
    //     "Bookshelf"という名前のクラスを作成してください
// - Bookshelfクラスには、最大で5冊の本を保持できるbookArrayという名前のString型配列を持ちます
// - Bookshelfクラスには、以下の操作を定義してください（メソッド名は任意です）
//   - 本を追加する操作
// - 引数として受け取った本のタイトルをbookArrayに追加します
// - もし既に5冊以上の本がある場合は、"本棚が満杯です"と出力して追加を行わないでください

// 本のリストを表示する
// - bookArrayに格納されている本のタイトルをすべて出力します
// - もし本が格納されていない場合は、"本棚は空です"と出力してください
// 本の数を返す
// - 現在の本棚に格納されている本の数を返します



    private String[] bookArray = new String[5];
    private int bookCount = 0;

    public void addBook(String title) {
        if (bookCount < 5) {
            bookArray[bookCount] = title;
            bookCount++;
        } else {
            System.out.println("本棚が満杯です");
        }
    }

    public void showBooks() {
        if (bookCount == 0) {
            System.out.println("本棚は空です");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(bookArray[i]);
            }
        }
    }

    public int getBookCount() {
        return bookCount;
    }

   
}
