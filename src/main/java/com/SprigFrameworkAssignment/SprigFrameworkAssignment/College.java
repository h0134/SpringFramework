package com.SprigFrameworkAssignment.SprigFrameworkAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("collegebean")
public class College {
    @Autowired
    Student student;
    @Autowired
            @Qualifier("scienceTeacher")
    Teacher teacher;

    public void education(){
        System.out.println("college provides education ");
        student.study();
        teacher.teach();
    }
}
