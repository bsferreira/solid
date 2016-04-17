package com.github.bsferreira.solid.lsp.solution;

/**
 * Created by bsferreira on 16-04-2016.
 */
public class Car extends Vehicle {

    @Override
    public void changeGear(Gear gear) {
        setCanChangeGear(Gear.R.equals(gear) && getGear().equals(Gear.D));
        super.changeGear(gear);
    }
}
