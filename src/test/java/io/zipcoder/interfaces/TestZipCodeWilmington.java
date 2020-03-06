package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {

    @Test
    public void TestHostLectureZipCodeWilmington(){
        ZipCodeWilmington z = ZipCodeWilmington.getINSTANCE();
        double hrs = 2.5;
        z.hostLecture(Educator.BYLETH,hrs);
        Map<Student,Double> expected = z.getStudyMap();
        Double expectedHours = hrs/expected.size();

        for (Map.Entry<Student,Double> e :expected.entrySet()) {
            Assert.assertEquals(expectedHours,e.getValue());
        }

    }
}
