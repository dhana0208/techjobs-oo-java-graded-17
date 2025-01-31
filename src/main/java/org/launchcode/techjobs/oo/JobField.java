package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {
    private String value;

    private int id;
    private static int nextId = 1;

    public JobField(String value){
        this();
        this.value= value;

    }
    public JobField(){
     this.id = nextId;
     nextId++;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return this.value;
    }
}
