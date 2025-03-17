package eu.ase.lab3;

import javax.swing.text.html.HTMLWriter;

public class Helicopter extends Aircraft{
    private int rotorBladesNo;

    public Helicopter(int weight, int rotorBladesNo) {
        super(weight);//super vede ca e intr-un constructor si apeleaza constructorul de la clasa parinte
        this.rotorBladesNo = rotorBladesNo;
    }

    public int getRotorBladesNo() {

        return rotorBladesNo;
    }

    public void setRotorBladesNo(int rotorBladesNo) {

        this.rotorBladesNo = rotorBladesNo;
    }

    @Override
    public void printAircraft(){
        super.printAircraft();
        System.out.println("Also, this is a helicopter and has " + this.rotorBladesNo + "rotor blades");
    }

    @Override
    public Helicopter clone() throws CloneNotSupportedException {
        Helicopter clone = (Helicopter) super.clone();
        clone.rotorBladesNo = this.rotorBladesNo;
        return clone;
    }
}
