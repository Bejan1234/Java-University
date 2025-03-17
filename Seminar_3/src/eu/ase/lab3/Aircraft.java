package eu.ase.lab3;

public class Aircraft implements Flight, Cloneable {
    private int weight;

    public Aircraft(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printAircraft(){

        System.out.println("Aircraft weighs " + this.weight + "pounds");
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter is taking off");
    }

    @Override
    public void land() {

        System.out.println("Helicopter is landing");
    }

    @Override
    public Aircraft clone() throws CloneNotSupportedException {
        Aircraft clone = (Aircraft) super.clone();
        clone.weight = this.weight;
        return clone;
    }
}
