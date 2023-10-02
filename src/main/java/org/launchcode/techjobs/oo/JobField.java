package org.launchcode.techjobs.oo;

public class JobField {
    private String value;

    private int id;
    private static int nextId = 1;

    public JobField(String value){
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
        return id;
    }
}
