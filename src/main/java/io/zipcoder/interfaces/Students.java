package io.zipcoder.interfaces;
import java.util.Iterator;

public final class Students extends People<Student>{

    private static final Students INSTANCE = new Students();

    private Students(){
        add(new Student(111,"Dimitri"));
        add(new Student(112,"Edelgard"));
        add(new Student(113,"Cloude"));
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        Iterator<Student> it = iterator();
        Student[] stu = new Student[this.count()];
        for (int i = 0; i <this.count() ; i++)
            stu[i] = it.next();

        return stu;
    }
}
