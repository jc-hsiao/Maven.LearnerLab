package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    People<Student> group = Students.getINSTANCE();

    @Test
    public void studentsInstanceTest(){
        long expectedId1 = 111;
        long expectedId2 = 112;
        long expectedId3 = 113;
        Person actualStu1 =  group.findById(expectedId1);
        Person actualStu2 =  group.findById(expectedId2);
        Person actualStu3 =  group.findById(expectedId3);

        Assert.assertNotNull(actualStu1);
        Assert.assertNotNull(actualStu2);
        Assert.assertNotNull(actualStu3);
        Assert.assertEquals(expectedId1, actualStu1.getId());
        Assert.assertEquals(expectedId2, actualStu2.getId());
        Assert.assertEquals(expectedId3, actualStu3.getId());

    }

}
