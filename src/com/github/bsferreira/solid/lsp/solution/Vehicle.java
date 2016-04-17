package com.github.bsferreira.solid.lsp.solution;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class Vehicle {

    private Gear gear;
    private boolean canChangeGear = true;

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        if(!canChangeGear()) {
            throw new RuntimeException("Can't change to REVERSE gear when " + getGear().toString() + " gear is engaged!");
        }
        this.gear = gear;
    }

    private boolean canChangeGear() {
        return this.canChangeGear;
    }

    public void setCanChangeGear(final boolean canChangeGear) {
        this.canChangeGear = canChangeGear;
    }

}