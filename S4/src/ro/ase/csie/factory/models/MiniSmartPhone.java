package ro.ase.csie.factory.models;

import ro.ase.csie.abstracts.ASmartPhone;

public class MiniSmartPhone extends ASmartPhone {
    float discount;

    public MiniSmartPhone(String model, String brand, int capacitateBaterie,float discount) {
        super(model, brand, capacitateBaterie);
        this.discount = discount;
    }
}
