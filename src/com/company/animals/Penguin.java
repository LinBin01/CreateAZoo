package com.company.animals;

import com.company.animals.Animal;

public class Penguin extends Animal {
    private String type;
    private String featherType;
    private double wingSpan;

    public Penguin(String name, String location, char gender, double weight, String type, String featherType, double wingSpan){
        super(name,location,gender,weight);
        this.type = type;
        this.featherType = featherType;
        this.wingSpan = wingSpan;
    }

    public String getType() {
        return type;
    }

    public String getFeatherType() {
        return featherType;
    }

    public void setFeatherType(String featherType) {
        this.featherType = featherType;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
