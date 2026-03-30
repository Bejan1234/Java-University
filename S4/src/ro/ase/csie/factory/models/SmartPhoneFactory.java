package ro.ase.csie.factory.models;

import ro.ase.csie.abstracts.ASmartPhone;

public class SmartPhoneFactory {
    public static ASmartPhone getSmartPhone(String type, String model, String brand, int capacitateBaterie){
       switch(type){
           case "extra":
               return new ExtraSmartPhone(model,brand,capacitateBaterie,2);
           case "mini":
               return new MiniSmartPhone(model,brand,capacitateBaterie,0.30f);
           case "super":
               return new SuperSmartPhone(model,brand,capacitateBaterie, 30);
           default:
               throw new UnsupportedOperationException("Not supported yet.");
       }

    }

}
