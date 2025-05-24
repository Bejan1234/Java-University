package ro.ase.acs.clases;

public class ArraySummingThread extends Thread {

    private int[]array;
    private int startIndex;
    private int endIndex;
    private long sum = 0;


    public ArraySummingThread(int[]array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {

        for(int i = startIndex;i<endIndex;i++) {
            sum += array[i];
        }
    }
    public long getSum() {
        return sum;
    }
}
