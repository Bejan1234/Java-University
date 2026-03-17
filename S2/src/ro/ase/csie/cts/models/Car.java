package ro.ase.csie.cts.models;

import ro.ase.csie.cts.exceptions.HydrogenException;
import ro.ase.csie.cts.interfaces.Engineable;

public class Car {
    public String brand;
    public String color;
    public int seats;
    public Engineable engine;

    public Car(String brand, String color, int seats, Engineable engine) {
        this.brand = brand;
        this.color = color;
        this.seats = seats;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engineable getEngine() {
        return engine;
    }

    public void setEngine(Engineable engine) {
        this.engine = engine;
    }

    public void move(int distance){
        engine.startEngine();
        System.out.println("Car is moving");
        engine.increaseDistance(200);
        try {
            engine.stopEngine();
        } catch (HydrogenException e) {
            System.out.println("Engine error: " + e.getMessage());
        }
    }
}
