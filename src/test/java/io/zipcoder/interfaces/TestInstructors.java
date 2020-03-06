package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    People group = Instructors.getINSTANCE();

    @Test
    public void instructorsInstanceSizeTest(){
        long expectedId = 2;
        Assert.assertEquals(expectedId, group.count());
    }

    @Test
    public void studentsInstanceTest(){
        long expectedId1 = 10;
        long expectedId2 = 11;
        Person actualTeach1 =  group.findById(expectedId1);
        Person actualTeach2 =  group.findById(expectedId2);

        Assert.assertNotNull(actualTeach1);
        Assert.assertNotNull(actualTeach2);
        Assert.assertEquals(expectedId1, actualTeach1.getId());
        Assert.assertEquals(expectedId2, actualTeach2.getId());
    }

}
