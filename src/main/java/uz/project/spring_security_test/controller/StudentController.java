package uz.project.spring_security_test.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;
import uz.project.spring_security_test.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/api/")
public class StudentController {
    List<Student> students = new ArrayList<Student>(List.of(
            new Student(1, "Ali", "Java"),
            new Student(1, "Vali", "React JS")
    ));

    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("csrf-token")
    public CsrfToken getCSRFToken(HttpServletRequest request){

        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("students")
    public void addStudent(@RequestBody Student student) {

        students.add(student);
        System.out.println(students.size());
    }



}
