package io.zipcoder.interfaces;

import java.util.Iterator;

public final class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        add(new Instructor(10,"Byleth"));
        add(new Instructor(11,"Robin"));
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        Iterator<Instructor> it = iterator();
        Instructor[] ins = new Instructor[this.count()];
        for (int i = 0; i <this.count() ; i++)
            ins[i] = it.next();
        return ins;
    }

}
