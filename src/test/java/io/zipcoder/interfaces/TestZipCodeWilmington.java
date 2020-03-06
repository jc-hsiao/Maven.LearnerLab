package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {

    @Test
    public void TestZipCodeWilmington(){
        ZipCodeWilmington z = ZipCodeWilmington.getINSTANCE();
        z.hostLecture(11,10);
        Map<Student,Double> expected = z.getStudyMap();

        Double expectedHours = 10.0/expected.size();
        for (Map.Entry<Student,Double> e :expected.entrySet()) {
            Assert.assertEquals(expectedHours,e.getValue());
        }

    }
}
