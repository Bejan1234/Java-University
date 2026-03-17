package ro.ase.csie.cts.models;

import ro.ase.csie.cts.interfaces.Engineable;
import ro.ase.csie.cts.interfaces.Printable;

public class EEngine implements Engineable, Printable {
        public int capacity;
        public float power;
        public String type;
        public int distance=0;
        public boolean isStarted=false;

        public EEngine(int capacity, float power, String type) {
            this.capacity = capacity;
            this.power = power;
            this.type = type;
        }

        public void startEngine(){
            isStarted = true;
            System.out.println("Starting the batteries");
        }

        public void stopEngine(){
            isStarted = false;
            System.out.println("Stopping the batteries");
        }

    @Override
    public void increaseDistance(int distance) {
        this.distance+= distance;
    }

    @Override
    public void print() {
        System.out.println(this.distance +" "+ this.power);
    }
}
