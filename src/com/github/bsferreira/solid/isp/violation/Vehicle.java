package com.github.bsferreira.solid.isp.violation;

/**
 * Created by bsferreira on 10-04-2016.
 */
public abstract class Vehicle implements Switches {

    private boolean engineRunning;

    public boolean isEngineRunning() {
        return engineRunning;
    }

    @Override
    public void startEngine() {
        engineRunning = true;
    }

    @Override
    public void shutDownEngine() {
        engineRunning = false;
    }

}