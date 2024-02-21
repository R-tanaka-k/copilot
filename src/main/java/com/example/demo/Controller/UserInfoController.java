package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserInfoController {
    // このクラスでは、フォームから送信されたデータをリクエストスコープに保存し、それを表示するメソッドを作成してください
    // また、リクエストスコープに保存するデータは、以下の通りです
    // 1. 名前
    // 2. 年齢
    // ここにメソッドを作成してください
    
    @GetMapping("")
    public String input() {
        return "show-user-info";
    }

}
