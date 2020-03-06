package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testTeach(){
        double hrs = 5.5;
        Learner someBoy = new Student(100,"Ike");
        Educator.SOREN.teach(someBoy,hrs);
        Assert.assertEquals( hrs, Educator.SOREN.getTimeWorked(),0.01 );
    }

    @Test
    public void testLecture(){
        Learner[] awakeningPPL= new Learner[]{
                new Student(50,"Chrom"),
                new Student(120,"Long'qu"),
                new Student(666,"Henry")
        };
        double hrs = 4;
        Educator.ROBIN.lecture(awakeningPPL,hrs);
        Assert.assertEquals( hrs, Educator.ROBIN.getTimeWorked(),0.01 );
    }

}
