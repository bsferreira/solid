package com.github.bsferreira.solid.lsp.solution;

/**
 * Created by bsferreira on 16-04-2016.
 */
public class Car extends Vehicle {

    @Override
    public void changeGear(Gear gear) {
        // can change to any gear except to REVERSE when actual gear  DRIVE
        setCanChangeGear(!Gear.R.equals(gear) || Gear.D.equals(getGear());
        super.changeGear(gear);
    }
}
