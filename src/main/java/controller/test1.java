package controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1 {


    @RequestMapping("/fuck")
    public String hello() {
        return "!!!!!!!";
    }
}
