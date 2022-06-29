package com.kodilla.inheritance.abstracts.homework;

public class Person {

    public String firstName;
    public int age;
    public Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public static void main(String[] args) {
        Job nurse = new Nurse(4000, "responsibilities nurse");
        Job teacher = new Teacher(3000, "responsibilities teacher");
        Job mechanic = new Mechanic(5000, "responsibilities mechanic");
        Person person1 = new Person("Anna", 22, nurse);
        Person person2 = new Person("Kate", 31, teacher);
        Person person3 = new Person("Jon", 29, mechanic);

        String person1Responsibilities = nurse.responsibilities;
        int nurseSalary = nurse.salary;

        String person2Responsibilities = teacher.responsibilities;
        int teacherSalary = teacher.salary;

        String person3Responsibilities = mechanic.responsibilities;
        int mechanicSalary = mechanic.salary;

        System.out.println(person1.firstName + " " + person1.age + " " + person1.job + " " + person1Responsibilities);
        System.out.println(person2.firstName + " " + person2.age + " " + person2.job + " " + person2Responsibilities);
        System.out.println(person3.firstName + " " + person3.age + " " + person3.job + " " + person3Responsibilities);
    }
}
