package com.sparta.spring_learning.HtmlController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    private static int visitCount = 0;

    /*
    동적인 페이지
     */

    @GetMapping("/hello/template")
    public String dynamic(Model model){
        ++visitCount;
        model.addAttribute("visits", visitCount);
        return "dynamicHTML";
    }
}
