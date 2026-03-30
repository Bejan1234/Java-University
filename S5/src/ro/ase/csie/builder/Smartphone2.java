package ro.ase.csie.builder;

public class Smartphone2 {
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

    Smartphone2(String brand, String name) {
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

        public SmartphoneBuilder(String brand, String name) {
            this.brand = brand;
            this.name = name;
        }

        public SmartphoneBuilder addCapacitateBaterie(int capacitateBaterie) {
            this.capacitateBaterie = capacitateBaterie;
            return this;
        }

        public SmartphoneBuilder addConnectionType(ConnectinType connection) {
            this.connection = connection;
            return this;
        }

        public SmartphoneBuilder addAntena(String antena) {
            this.antena = antena;
            return this;
        }

        public SmartphoneBuilder addRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public SmartphoneBuilder addStorage(float storage) {
            this.storage = storage;
            return this;
        }

        public SmartphoneBuilder addIsUnlocked(boolean isUnlocked) {
            this.isUnlocked = isUnlocked;
            return this;
        }

        public SmartphoneBuilder addCuloare(String culoare) {
            this.culoare = culoare;
            return this;
        }

        public SmartphoneBuilder addNrCamere(int nrCamera) {
            this.nrCamere = nrCamera;
            return this;
        }

        public Smartphone2 build() {
            Smartphone2 smartphone =  new Smartphone2(brand, name);
            smartphone.capacitateBaterie = capacitateBaterie;
            smartphone.brand = brand;
            //...
            return smartphone;
        }


    }
}
