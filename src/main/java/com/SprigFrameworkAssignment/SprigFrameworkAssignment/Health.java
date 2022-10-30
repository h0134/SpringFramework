package com.SprigFrameworkAssignment.SprigFrameworkAssignment;


public class Health {



    public Exercise exercise;


    public Health(Exercise exerciseobj) {
        this.exercise = exerciseobj;
    }

    public void healthy(){
        System.out.println("To keep ourselves fit we should do exercise everyday");
        exercise.exercise();
    }
}
