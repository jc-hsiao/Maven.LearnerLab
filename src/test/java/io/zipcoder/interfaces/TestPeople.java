package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    //    Create a testAdd method which ensures that our personList in our People class populated with respective Person objects following invokation of the add method.
    @Test
    public void testAdd(){
        People ppl = new People();
        ppl.add(new Person(111, "Max"));
        ppl.add(new Person(112, "Lia"));
        Assert.assertEquals(2,ppl.count());
    }

    //    Create a testRemove method which ensures that the personList in a People object is depopulated with a respective Person object following the invokation of the remove method.
    @Test
    public void testRemove(){
        People ppl = new People();
        Person expected = new Person(112, "Lia");
        ppl.add(new Person(111, "Max"));
        ppl.add(expected);
        ppl.remove(111);
        Assert.assertEquals(1,ppl.count());
        Assert.assertEquals(expected,ppl.toArray()[0]);
    }
    //    Create a testFindById method which ensures that a respective Person object with a respective id field is returned upon invokation of the findById method on a respective People object.

    @Test
    public void testFindById() {
        People ppl = new People();
        Person expected = new Person(112, "Lia");
        ppl.add(expected);
        Assert.assertEquals(expected, ppl.findById(112));
    }


}
