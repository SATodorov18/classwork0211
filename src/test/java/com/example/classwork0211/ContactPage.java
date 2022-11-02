package com.example.classwork0211;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ContactPage {

    @RequestMapping("/contact")
    public String printContactPageText() {
        return "SATodorov18@codingburgas.bg";
    }
}