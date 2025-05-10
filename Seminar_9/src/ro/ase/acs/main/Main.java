package ro.ase.acs.main;

import ro.ase.acs.clases.SyncedThread;
import ro.ase.acs.clases.UnsyncedThread;

public class Main {
    public static void main(String[] args) {
//        UnsyncedThread t1 = new UnsyncedThread("Thread1");
//        t1.start();
//        UnsyncedThread t2 = new UnsyncedThread("Thread2");
//        t2.start();



        SyncedThread t3 = new SyncedThread("Thread 3");
        new Thread(t3).start();
        SyncedThread t4 = new SyncedThread("Thread 4");
        new Thread(t4).start();




        Runnable r = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Message from another thread");
        };

        new Thread(r).start();

        System.out.println("Main ended");
    }
}
