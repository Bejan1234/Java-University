package ro.ase.csie.abstracts;

public abstract class ASmartPhone {
    String model;
    String brand;
    int capacitateBaterie;



    public ASmartPhone(String model, String brand, int capacitateBaterie) {
        this.model = model;
        this.brand = brand;
        this.capacitateBaterie = capacitateBaterie;


    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", capacitateBaterie=" + capacitateBaterie +
                '}';
    }

}
