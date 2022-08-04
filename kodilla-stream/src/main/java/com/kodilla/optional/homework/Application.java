package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Monica", new Teacher("Ross")));
        students.add(new Student("Rachel", new Teacher( null)));
        students.add(new Student("Chandler", new Teacher("Mike")));
        students.add(new Student("Joey", new Teacher("Phoebe")));
        students.add(new Student("Gunther", new Teacher(null)));

        Student student = new Student("Ross", new Teacher("Emily"));

    for(Student result : students) {
        System.out.println("Uczeń" + students);
    }

        Optional<Student> optionalStudent = Optional.ofNullable(student);

        optionalStudent.ifPresent(s -> System.out.println(s.getName()));


    }
}
