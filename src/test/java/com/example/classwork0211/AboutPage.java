package com.example.classwork0211;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AboutPage {

    @RequestMapping("/about")
    public String printAboutPageText() {
        return "gruduu";
    }
}