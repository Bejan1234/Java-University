package ro.ase.acs.clases;

import java.util.Random;

public class UnsyncedThread extends Thread {
    private static Random rand = new Random();
    private static int a = 0;
    private static int b = 0;

    public UnsyncedThread(String name) {
        super(name);
    }

    private void method(){

        System.out.printf("%s: a = %d b = %d\r\n",getName() ,a ,b);
        a++;
        try {
            Thread.sleep(rand.nextInt(3000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        b++;
    }


    @Override
    public void run() {
        super.run();
        for(int i =0; i<3;i++){
         method();
        }
    }
}
