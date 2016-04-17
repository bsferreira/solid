package com.github.bsferreira.solid.dip.solution;

/**
 * Created by bsferreira on 17-04-2016.
 */
public class Driver {

    private Vehicle vehicle;

    public Driver(final Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}
