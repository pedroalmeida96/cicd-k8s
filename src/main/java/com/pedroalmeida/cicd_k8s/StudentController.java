package com.pedroalmeida.cicd_k8s;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
@Log4j2
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        Student student = new Student("Pedro");
        return List.of(student);
    }

}
