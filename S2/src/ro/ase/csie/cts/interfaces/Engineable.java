package ro.ase.csie.cts.interfaces;

import ro.ase.csie.cts.exceptions.HydrogenException;

public interface Engineable {

    public void startEngine();
    public void stopEngine() throws HydrogenException;
    public void increaseDistance(int distance);
}
