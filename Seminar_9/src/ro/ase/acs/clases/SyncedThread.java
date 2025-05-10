package ro.ase.acs.clases;

import java.util.Random;

public class SyncedThread implements Runnable {

    private static Random rand = new Random();

    private static int a = 0;
    private static int b = 0;
    private String name;
    private static Object look = new Object();

    public SyncedThread(String name) {
        this.name = name;
    }


    private  void method() {
        synchronized (look) {
            System.out.printf("%s: a = %d, b = %d\r\n", name, a, b);

            a++;
            try {
                Thread.sleep(rand.nextInt(3000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            b++;
        }

    }

    @Override
    public void run() {
     for(int i = 0 ; i < 3;i++){
         method();
     }
    }
}
