package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {


    People<Student> ppl = Students.getINSTANCE();

    @Test
    public void testAdd(){
        Student newStudent = new Student(114,"Lissa");
        ppl.add(newStudent);
        Assert.assertTrue(ppl.contains(newStudent));
    }

    @Test
    public void testRemove(){
        Student newStudent = new Student(115,"Donnel");
        ppl.add(newStudent);
        ppl.remove(newStudent);
        Assert.assertFalse(ppl.contains(newStudent));
    }

    @Test
    public void testFindById() {
        long id = 116;
        Student expectedStudent = new Student(id,"Stahl");
        ppl.add(expectedStudent);
        Student actualStudent = ppl.findById(id);
        Assert.assertEquals(expectedStudent,actualStudent);
    }


}
