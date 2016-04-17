package com.github.bsferreira.solid.ocp.solution;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class Vehicle {

    private int power;
    private int suspensionHeight;

    public int getPower() {
        return power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    public void setPower(final int power) {
        this.power = power;
    }

    public void setSuspensionHeight(final int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }

}