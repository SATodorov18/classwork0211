package com.example.classwork0211;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserPage {

    @RequestMapping("/user")
    public String printUserPageText() {
        return "User: Stanislav Todorov" + " Age: 17" + " From: Sredec";
    }
}