package ro.ase.csie.methodfactory.abstracts;

public abstract class AMovie {
    private String title;

    protected AMovie(String title){
        this.title = title;
    }

    public abstract void print();
}
