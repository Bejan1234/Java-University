package ro.ase.csie.builder.main;

import ro.ase.csie.builder.ConnectinType;
import ro.ase.csie.builder.Smartphone;

public class Main {
    void main(){

        Smartphone smartphone = new Smartphone.SmartphoneBuilder("Samsung", "S25").build();
//        System.out.println(smartphone);
        Smartphone phone = new Smartphone.SmartphoneBuilder("Iphone", "15")
                .addRAM(15)
                .addAntena("Vodafon")
                .addConnectionType(ConnectinType.c5G)
                .build();
        System.out.println(phone);
    }
}
