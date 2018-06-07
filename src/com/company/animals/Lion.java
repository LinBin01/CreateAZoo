package com.company.animals;

import com.company.animals.Animal;

public class Lion extends Animal {
    private double noseSize;
    private double maneLength;
    private boolean isTrained;

    public Lion(String name, String location, char gender, double weight, double maneLength, boolean isTrained) {
        super(name,location,gender, weight);
        this.maneLength = maneLength;
        this.isTrained = isTrained;
    }

    public double getNoseSize() {
        return noseSize;
    }

    public void setNoseSize(double noseSize) {
        this.noseSize = noseSize;
    }

    public double getManeLength() {
        return maneLength;
    }

    public void setManeLength(double maneLength) {
        this.maneLength = maneLength;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
}
