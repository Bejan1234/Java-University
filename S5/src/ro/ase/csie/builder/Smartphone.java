package ro.ase.csie.builder;

public class Smartphone {
    int capacitateBaterie;
    String brand;
    String name;
    String antena;
    ConnectinType connection;
    int RAM;
    float storage;
    boolean isUnlocked;
    String culoare;
    int nrCamere;

    Smartphone(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "capacitateBaterie=" + capacitateBaterie +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", antena='" + antena + '\'' +
                ", connection=" + connection +
                ", RAM=" + RAM +
                ", storage=" + storage +
                ", isUnlocked=" + isUnlocked +
                ", culoare='" + culoare + '\'' +
                ", nrCamere=" + nrCamere +
                '}';
    }

    public static class SmartphoneBuilder {
        Smartphone smartphone;

        public SmartphoneBuilder(String brand, String name) {
            this.smartphone = new Smartphone(brand, name);
        }

        public SmartphoneBuilder addCapacitateBaterie(int capacitateBaterie) {
            this.smartphone.capacitateBaterie = capacitateBaterie;
            return this;
        }

        public SmartphoneBuilder addConnectionType(ConnectinType connection) {
            this.smartphone.connection = connection;
            return this;
        }

        public SmartphoneBuilder addAntena(String antena) {
            this.smartphone.antena = antena;
            return this;
        }

        public SmartphoneBuilder addRAM(int RAM) {
            this.smartphone.RAM = RAM;
            return this;
        }

        public SmartphoneBuilder addStorage(float storage) {
            this.smartphone.storage = storage;
            return this;
        }

        public SmartphoneBuilder addIsUnlocked(boolean isUnlocked) {
            this.smartphone.isUnlocked = isUnlocked;
            return this;
        }

        public SmartphoneBuilder addCuloare(String culoare) {
            this.smartphone.culoare = culoare;
            return this;
        }

        public SmartphoneBuilder addNrCamere(int nrCamera) {
            this.smartphone.nrCamere = nrCamera;
            return this;
        }

        public Smartphone build() {
            return smartphone;
        }


    }
}
