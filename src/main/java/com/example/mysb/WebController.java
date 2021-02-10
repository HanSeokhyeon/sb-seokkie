package com.example.mysb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @GetMapping("/")
    @ResponseBody
    public String main() {
        String html = "<a href=\"https://google.com\">Google</a>";
        html += "<a href=\"https://11st.co.kr\">11st</a>";
        return html;
    }
}
