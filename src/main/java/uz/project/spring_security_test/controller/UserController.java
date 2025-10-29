package uz.project.spring_security_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.project.spring_security_test.model.User;
import uz.project.spring_security_test.repository.UserRepository;
import uz.project.spring_security_test.service.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("registr")
    public User registr(@RequestBody User user) {
        return userService.save(user);
    }
}
