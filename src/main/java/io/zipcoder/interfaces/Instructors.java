package io.zipcoder.interfaces;

public final class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        add(new Instructor(10,"Byleth"));
        add(new Instructor(11,"Robin"));
    };

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }

}
