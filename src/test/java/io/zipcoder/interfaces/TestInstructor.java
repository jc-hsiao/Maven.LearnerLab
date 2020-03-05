package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestInstructor {


    @Test
    public void testImplementation(){
        Teacher i = new Instructor();
        Assert.assertTrue(i instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Teacher i = new Instructor();
        Assert.assertTrue(i instanceof Person);
    }

    @Test
    public void testTeach(){
        Teacher i = new Instructor();
        Learner l = new Student();
        Double hours = 3.5;
        i.teach(l,hours);
        Assert.assertEquals(hours, l.getTotalStudyTime());

    }


    @Test
    public void testLecture(){
        Teacher i = new Instructor();
        Learner[] ls = {new Student(),new Student(), new Student()};

        Double hours = 3.5;
        Double expected = 3.5/ls.length;

        i.lecture(ls,hours);
        for (int j = 0; j < 3 ; j++) {
            Assert.assertEquals(expected, ls[j].getTotalStudyTime());
        }

    }



}
