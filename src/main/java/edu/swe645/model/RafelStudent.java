package edu.swe645.model;

import java.io.Serializable;

public class RafelStudent implements Serializable {
    private static final long serialVersionUID = -8805793568124871171L;
    Integer ID;
    Student student;
    Integer rafelNumber;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getRafelNumber() {
        return rafelNumber;
    }

    public void setRafelNumber(Integer rafelNumber) {
        this.rafelNumber = rafelNumber;
    }
}
