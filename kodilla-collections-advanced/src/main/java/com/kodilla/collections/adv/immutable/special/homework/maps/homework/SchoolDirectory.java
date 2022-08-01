package com.kodilla.collections.adv.immutable.special.homework.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> schools = new HashMap<>();
        School birmingham = new School("Birmingham");
        School london = new School("London");
        School glasgow = new School("Glasgow");
        School manchester = new School("Manchester");
        School liverpool = new School("Liverpool");

        birmingham.addClass(new SchoolClass("class A", 22));
        london.addClass(new SchoolClass("class A", 19));
        london.addClass(new SchoolClass("class B", 21));
        london.addClass(new SchoolClass("class C", 18));
        glasgow.addClass(new SchoolClass("class A", 22));
        manchester.addClass(new SchoolClass("class A", 18));
        manchester.addClass(new SchoolClass("class B", 21));
        liverpool.addClass(new SchoolClass("class A", 22));
        liverpool.addClass(new SchoolClass("class B", 23));

        schools.put(new Principal("Joey"), birmingham);
        schools.put(new Principal("Ross"), london);
        schools.put(new Principal("Monica"), glasgow);
        schools.put(new Principal("Rachel"), manchester);
        schools.put(new Principal("Phoebe"),liverpool);

        for (Map.Entry<Principal, School> entry : schools.entrySet()) {
            System.out.println(entry.getKey().getName() + " " + entry.getValue().getSchoolName() + " " + entry.getValue().sum());
        }
    }
}
