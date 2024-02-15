package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class FavoriteBookController {
    // このクラスには、作成した`[favorite-book.html]`にフォワードさせる`showFavoriteBook()`メソッドを作成してください
    @RequestMapping("/show-favorite1")
    public String showFavoriteBook() {
        return "favorite-book";
    }
}
