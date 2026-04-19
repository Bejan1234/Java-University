package ro.ase.csie.factory.models;

import ro.ase.csie.abstracts.ASmartPhone;

public class SuperSmartPhone extends ASmartPhone {
    int putereIncarcare;


    public SuperSmartPhone(String model, String brand, int capacitateBaterie,int putereIncarcare) {
        super(model, brand, capacitateBaterie);
        this.putereIncarcare = putereIncarcare;
    }


}
