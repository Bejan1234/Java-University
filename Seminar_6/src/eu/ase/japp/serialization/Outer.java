package eu.ase.japp.serialization;

public class Outer {

    private int id = 5;

    public int getId() {
        return this.id;
    }

    public class Inner {
        public void modifyId() {
            id = id + 100;
        }
    }

    public static class StaticNestedClass {

    }
}
