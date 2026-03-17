package ro.ase.csie.cts.models;

import ro.ase.csie.cts.exceptions.HydrogenException;
import ro.ase.csie.cts.interfaces.Engineable;

public class HEngine implements Engineable {

    public int capacity;
    public float power;
    public String type;
    public int distance=0;
    public boolean isStarted=false;

    public HEngine(int capacity, float power, String type) {
        this.capacity = capacity;
        this.power = power;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() throws HydrogenException {
        throw new HydrogenException("Hydrogen cannot be stopped");
    }

    @Override
    public void increaseDistance(int distance) {

    }
}
