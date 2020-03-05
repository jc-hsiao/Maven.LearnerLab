package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Person p = new Student();
        Assert.assertTrue(p instanceof Learner);
    }
    @Test
    public void testImplementation2(){
        Student s = new Student();
        Assert.assertTrue(s instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student s = new Student();
        Assert.assertTrue(s instanceof Person);
    }

    @Test
    public void testLearn(){
        Student s = new Student();
        Double expected = 10.0;
        s.learn(expected);
        Assert.assertEquals(expected,s.getTotalStudyTime());
    }


}
