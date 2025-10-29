package uz.project.spring_security_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping()
public class HelloController {

    @GetMapping("hello")
    public String greater(){
        return "Hello World";
    }
    @GetMapping("about")
    public String about(){
        return "uzProjects";
    }
}
