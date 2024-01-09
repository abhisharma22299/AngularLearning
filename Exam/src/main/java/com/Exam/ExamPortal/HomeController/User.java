package com.Exam.ExamPortal.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class User {
    @GetMapping("/")
   public String create(){
       return "login";
   }
}
