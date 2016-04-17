package com.github.bsferreira.solid.ocp.solution;

/**
 * Created by bsferreira on 16-04-2016.
 */
public class Economy implements DrivingMode{

    private static final int POWER = 300;
    private static final int SUSPENSION_HEIGHT = 20;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeight() {
        return SUSPENSION_HEIGHT;
    }
}
