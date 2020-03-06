package io.zipcoder.interfaces;

public final class Students extends People{

    private static final Students INSTANCE = new Students();

    private Students(){
        add(new Student(111,"Dimitri"));
        add(new Student(112,"Edelgard"));
        add(new Student(113,"Cloude"));
    };

    public static Students getINSTANCE() {
        return INSTANCE;
    }
}
