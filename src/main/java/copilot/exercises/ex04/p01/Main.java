package copilot.exercises.ex04.p01;

public class Main {
// Mainクラスを作成してください
// - mainメソッドで以下を行ってください
//   - Bookshelfオブジェクトを作成します
//   - 本を3冊追加します
//   - 本のリストを表示します
//   - 本の数を取得し、その値を出力します

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook("book1");
        bookshelf.addBook("book2");
        bookshelf.addBook("book3");
        bookshelf.showBooks();
        System.out.println(bookshelf.getBookCount());
    }
    

}
