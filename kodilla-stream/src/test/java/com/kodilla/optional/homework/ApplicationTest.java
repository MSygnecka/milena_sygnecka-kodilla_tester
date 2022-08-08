package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void testApplicationIfTeacherIsNotNull() {
        Application application = new Application();

        List<Student> students = new ArrayList<>();
        students.add(new Student("Monica Geller", new Teacher("Ross Geller")));
        students.add(new Student("Chandler Bing", new Teacher("Mike Hannigan")));
        students.add(new Student("Joey Tribbiani", new Teacher("Phoebe Buffay")));

        for(Student result : students) {

            Optional<Teacher> optionalTeacher = Optional.ofNullable(result.getTeacher());

            Teacher name = optionalTeacher.orElse(new Teacher(("<undefined>")));

            assertEquals(result.getTeacher().getName(),name.getName());
            }
        }
    @Test
    public void testApplicationIfTeacherIsNull() {
        Application application = new Application();

        List<Student> students = new ArrayList<>();
        students.add(new Student("Rachel Green", null));
        students.add(new Student("Gunther", null));

        for (Student result : students) {

            Optional<Teacher> optionalTeacher = Optional.ofNullable(result.getTeacher());

            Teacher name = optionalTeacher.orElse(new Teacher(("<undefined>")));

            assertEquals("<undefined>", name.getName());
        }
    }
}