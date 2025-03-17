package eu.ase.lab3;

public class Airplane extends Aircraft implements AutoCloseable {
    private int enginesNo;
    private static int airplanesNo;

    public Airplane(int weight, int enginesNo) {
        super(weight);
        this.enginesNo = enginesNo;
        airplanesNo++;
    }

    public int getEnginesNo() {

        return enginesNo;
    }

    public void setEnginesNo(int enginesNo) {
        this.enginesNo = enginesNo;
    }

    public static int getAirplanesNo() {

        return airplanesNo;
    }

    public static void setAirplanesNo(int airplanesNo) {

        Airplane.airplanesNo = airplanesNo;
    }

    @Override
    public void close() throws Exception {
     airplanesNo--;
    }
}
