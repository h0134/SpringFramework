package com.SprigFrameworkAssignment.SprigFrameworkAssignment;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Hello, I am your science TEacher");
    }
}
