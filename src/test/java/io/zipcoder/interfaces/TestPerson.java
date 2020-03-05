package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person p1 = new Person(100,"a");
        String actualName = p1.getName();
        String expectedName = "a";

        long actualId = p1.getId();
        long expectedId = 100;
        Assert.assertEquals(actualName,expectedName);
        Assert.assertEquals(actualId,expectedId);
    }

    @Test
    public void testSetName(){
        Person p1 = new Person(100,"a");
        String newName = "John";
        p1.setName(newName);
        String actualName = p1.getName();
        Assert.assertEquals(actualName, newName);
    }

}
