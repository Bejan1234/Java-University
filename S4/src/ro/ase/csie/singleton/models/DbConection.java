package ro.ase.csie.singleton.models;

public class DbConection {
    String nume;

    public static final DbConection instance = new DbConection("Ionel");

    private DbConection() {

    }

    public static DbConection getInstance(String name) {
        if(instance==null)
            return instance;
        return null;
    }

    private DbConection(String nume) {
        this.nume = nume;
        System.out.println("Creating connection" + this.nume);
    }




}
