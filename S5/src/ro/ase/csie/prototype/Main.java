package ro.ase.csie.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(21);
        arr.add(19);
        arr.add(22);


//        Headbook h1 = new Headbook(arr);
//        Headbook h2 = new Headbook(arr);
//        Headbook h3 = new Headbook(arr);

        Headbook[] headbookArray = new Headbook[]{PrototypeFactory.getPrototype(HeadbookType.REGULAR), PrototypeFactory.getPrototype(HeadbookType.REGULAR), PrototypeFactory.getPrototype(HeadbookType.INFLUENCER), PrototypeFactory.getPrototype(HeadbookType.INFLUENCER), PrototypeFactory.getPrototype(HeadbookType.LONER)};
        for(Headbook headbook : headbookArray){
            System.out.println(headbook);
        }
    }
}
