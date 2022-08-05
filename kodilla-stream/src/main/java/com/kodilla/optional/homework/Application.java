package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Monica Geller", new Teacher("Ross Geller")));
        students.add(new Student("Rachel Green", null));
        students.add(new Student("Chandler Bing", new Teacher("Mike Hannigan")));
        students.add(new Student("Joey Tribbiani", new Teacher("Phoebe Buffay")));
        students.add(new Student("Gunther", null));

    for(Student result : students) {

        Optional<Teacher> optionalStudent = Optional.ofNullable(result.getTeacher());
        Teacher name = optionalStudent.orElse(new Teacher(("<undefined>")));

        System.out.println("Uczeń" + " " + result.getName() + " " + "Nauczyciel" + " " + name.getName());
    }
    }
}
