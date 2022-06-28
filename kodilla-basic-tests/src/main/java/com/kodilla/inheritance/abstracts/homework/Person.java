package com.kodilla.inheritance.abstracts.homework;

public class Person {

    public String firstName;
    public int age;
    public String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public static void main(String[] args) {
        Person person1 = new Person("Anna", 22, "nurse");
        Person person2 = new Person("Kate", 31, "teacher");
        Person person3 = new Person("Jon", 29, "machanic");

        Job nurse = new Nurse(4000, "responsibilities nurse");
        String nurseResponsibilities = nurse.responsibilities;
        int nurseSalary = nurse.salary;

        Job teacher = new Teacher(3000, "responsibilities teacher");
        String teacherResponsibilities = teacher.responsibilities;
        int teacherSalary = nurse.salary;

        Job mechanic = new Mechanic(5000, "responsibilities mechanic");
        String mechanicResponsibilities = mechanic.responsibilities;
        int mechanicSalary = mechanic.salary;

        System.out.println(person1.firstName + " " + person1.age + " " + person1.job + " " + nurseResponsibilities);
        System.out.println(person2.firstName + " " + person2.age + " " + person2.job + " " + teacherResponsibilities);
        System.out.println(person3.firstName + " " + person3.age + " " + person3.job + " " + mechanicResponsibilities);
    }
}
