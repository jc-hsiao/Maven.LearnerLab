package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {

    private Students students;
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){
        students = Students.getINSTANCE();
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(),numberOfHours);
    }

    public Map<Student,Double> getStudyMap(){
        Map<Student,Double> map = new HashMap<>();
        for (Student s :students.toArray()) {
            map.put( s , s.getTotalStudyTime() );
        }
        return map;
    }

    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }

}
