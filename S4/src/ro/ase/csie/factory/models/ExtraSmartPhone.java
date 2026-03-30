package ro.ase.csie.factory.models;

import ro.ase.csie.abstracts.ASmartPhone;

public class ExtraSmartPhone extends ASmartPhone {
    int nrEcrane;

    public ExtraSmartPhone(String model, String brand, int capacitateBaterie,int nrEcrane) {
        super(model, brand, capacitateBaterie);
       this.nrEcrane=nrEcrane;
    }
}
