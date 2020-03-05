package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime = 0;

    public void learn(double numberOfHours) {
        totalStudyTime= totalStudyTime+numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
