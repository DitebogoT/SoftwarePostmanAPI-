package org.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class studentController {

    public List<studentApplication> students = new ArrayList<>();

    public studentController() {

        students.add(new studentApplication(
                1, "Java Fundamentals", "diditlhakola@gmail.com",
                "Tlhakola", "Ditebogo"
        ));

        students.add(new studentApplication(
                2, "Internet Programming", "raphadu@gmail.com",
                "Raphadu", "Sello"
        ));

        students.add(new studentApplication(
                3, "System Analysis", "moepi@gmail.com",
                "Moepi", "Tirelo"
        ));
    }

    @GetMapping
    public List<studentApplication> getAllStudents()
    {
        return students;
    }




}
