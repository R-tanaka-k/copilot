package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Form.UserHobbiesForm;

@Controller
@RequestMapping("/userHobbies")
public class UserHobbiesController {
    // このクラスでは、フォームから送信されたユーザー名と趣味のリストを受け取り、それを次の画面に渡すメソッドを作成してください

    // ここにコードを記述してください
    @Autowired 
    private UserHobbiesForm userHobbiesForm;
    
    @RequestMapping("/input")
    public String input() {
        return "user-hobbies-form";
    }
    
}
