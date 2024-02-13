// 以下の状況を想定し、ArrayListと自作の料理クラスを使用して解決してください

// あなたはレストランのメニューを管理しています
// 料理を表すCookingというクラスを作成し、料理の名前と価格を保持します
// そして、ArrayListを使用してこのメニューを管理します

// ### Cookingクラスを作成してください
// - このクラスは、料理の名前(String型)と価格(int型)の2つの属性を持ちます

// ### メニューを管理するArrayListを作成してください
// - このArrayListは、Cookingクラスのインスタンスを要素として持ちます
package copilot.exercises.ex07.p01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;




public class Cooking {
    private String name;
    private int price;
    public Cooking(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    //Main内の指示:
// - ①ArrayList\<Cooking>を使用して料理を管理してください
// - ②Cookingクラスのインスタンスを作成して、3つの料理を追加してください
// - 「ステーキ」（価格: 2500円）、 「サラダ」（価格: 800円）、 「パスタ」（価格: 1200円）
// - ③ArrayList\<Cooking>の中の料理の情報（名前と価格）を表示してください
// - ④ある料理の価格を変更してください（例えば、ステーキの価格を3500円に変更するなど）
// - ⑤ArrayList\<Cooking>の中の料理を価格の安い順に並び替えてください
// - ⑥並び替えたArrayList\<Cooking>の中の料理の情報（名前と価格）を表示してください
    public static void main(String[] args) {
        // ①ArrayList<Cooking>を使用して料理を管理してください
        ArrayList<Cooking> menu = new ArrayList<Cooking>();
        // ②Cookingクラスのインスタンスを作成して、3つの料理を追加してください
        // - 「ステーキ」（価格: 2500円）、 「サラダ」（価格: 800円）、 「パスタ」（価格: 1200円）
        menu.add(new Cooking("ステーキ", 2500));
        menu.add(new Cooking("サラダ", 800));
        menu.add(new Cooking("パスタ", 1200));
        // ③ArrayList<Cooking>の中の料理の情報（名前と価格）を表示してください
        for (Cooking c : menu) {
            System.out.println(c.getName() + " : " + c.getPrice() + "円");
        }
        // ④ある料理の価格を変更してください（例えば、ステーキの価格を3500円に変更するなど）
        for (Cooking c : menu) {
            if (c.getName().equals("ステーキ")) {
                c.setPrice(3500);
            }
        }
        // ⑤ArrayList<Cooking>の中の料理を価格の安い順に並び替えてください
        Collections.sort(menu, new Comparator<Cooking>() {
            public int compare(Cooking c1, Cooking c2) {
                return c1.getPrice() - c2.getPrice();
            }
        });
        // ⑥並び替えたArrayList<Cooking>の中の料理の情報（名前と価格）を表示してください
        for (Cooking c : menu) {
            System.out.println(c.getName() + " : " + c.getPrice() + "円");
        }
    }
    private void setPrice(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrice'");
    }
}