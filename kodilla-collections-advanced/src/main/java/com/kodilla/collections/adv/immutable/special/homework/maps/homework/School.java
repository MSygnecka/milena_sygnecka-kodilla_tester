package com.kodilla.collections.adv.immutable.special.homework.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<SchoolClass> students = new ArrayList<>();
    private String schoolName;

    public void addClass (SchoolClass schoolClass) {

        students.add (schoolClass);
    }
    public School (String schoolName) {
        this.schoolName = schoolName;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public int sum() {
        int sum = 0;
        for (SchoolClass schoolClass : students) {
            sum = sum + schoolClass.getNumberOfStudents();
        }
        return sum;
    }

}
