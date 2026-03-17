package ro.ase.csie.cts.models;

import ro.ase.csie.cts.interfaces.Engineable;

public class TEngine implements Engineable {
    public int capacity;
    public float power;
    public String type;
    public int distance=0;
    public boolean isStarted=false;

    public TEngine(int capacity, float power, String type) {
        this.capacity = capacity;
        this.power = power;
        this.type = type;
    }

    public void startEngine(){
        isStarted = true;
        System.out.println("Engine is started");
    }

    public void stopEngine(){
        isStarted = false;
        System.out.println("Engine is stopped");
    }

    @Override
    public void increaseDistance(int distance) {
        this.distance += (1.25 * distance);
    }
}
