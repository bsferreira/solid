package com.github.bsferreira.solid.lsp.solution;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class Vehicle {

    private boolean isMoving;
    private Gear gear;

    public void move(){
        isMoving = true;
    }

    public void stop(){
        isMoving = false;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }

}