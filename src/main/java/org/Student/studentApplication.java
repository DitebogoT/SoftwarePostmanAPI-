package org.Student;

import java.util.ArrayList;
import java.util.List;

public class studentApplication {
 public int ID;
 public String firstName;
 public String lastName;
 public String email;
 public String course;
 List<String> Student = new ArrayList<>();

    public studentApplication(int ID, String course, String email, String lastName, String firstName) {
        this.ID = ID;
        this.course = course;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.Student = Student;
    }
}
