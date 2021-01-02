package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal john = new Principal("John", "Davidson");
        Principal michael = new Principal("Michael", "Smith");
        Principal kevin = new Principal("Kevin", "Douglas");

        School primarySchool = new School("Primary School",23,27,30,22,28);
        School middleSchool = new School("Middle School",33,31,30,29,27);
        School highSchool = new School("High School",22,26,24,21,23);

        schools.put(john, primarySchool);
        schools.put(michael, middleSchool);
        schools.put(kevin, highSchool);

        for(Map.Entry<Principal, School> schoolEntry : schools.entrySet()) {
            System.out.println(schoolEntry.getKey() + ", " + "School name: " + schoolEntry.getValue().getSchoolName() + ", " + "Total number of students: " + schoolEntry.getValue().numberOfStudents());
        }
    }
}
