package com.github.bsferreira.solid.dip.violation;

/**
 * Created by bsferreira on 17-04-2016.
 */
public class Pilot {

    private RacingCar vehicle;

    public Pilot(final RacingCar vehicle){
        this.vehicle = vehicle;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}
