package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    BYLETH(new Instructor(10,"Byleth")),
    ROBIN(new Instructor(11,"Robin")),
    SOREN(new Instructor(12,"Soren"))
    ;

    final private Instructor i;
    private double timeWorked;

    Educator(Instructor i ){
        this.i = i;
        timeWorked = 0;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        i.teach(learner,numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        i.lecture(learners,numberOfHours);
        timeWorked += numberOfHours;

    }
}
