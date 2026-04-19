package ro.ase.csie.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static ro.ase.csie.prototype.HeadbookType.*;

public class PrototypeFactory {
    private static Map<HeadbookType, Headbook> prototypes = new HashMap<>();

    static{
        prototypes.put(LONER, new Headbook(new ArrayList<>()));
        prototypes.put(REGULAR, new Headbook(new ArrayList<>(Arrays.asList(1,6,10,23,5))));
        prototypes.put(INFLUENCER, new Headbook(new ArrayList<>(Arrays.asList(1,6,10,23,5,310, 225, 951,288,177,126,92,60,100,803))));
    }

    public static Headbook getPrototype(HeadbookType type) {
        try {
            return (Headbook) prototypes.get(type).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}