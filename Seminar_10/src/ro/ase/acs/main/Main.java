package ro.ase.acs.main;

import ro.ase.acs.clases.ArraySummingCallable;
import ro.ase.acs.clases.ArraySummingThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        final int NB_OF_ELEMENTS = 500_000_000;

        final int NB_OF_THREADS = 4;

        int[] array = new int[NB_OF_ELEMENTS];

        for (int i = 0; i < NB_OF_ELEMENTS; i++) {
            array[i] = i + 1;
        }

        long sum = 0;
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < NB_OF_ELEMENTS; i++) {
            sum += array[i];
        }

        long endTime = System.currentTimeMillis();

        System.out.printf("Sequantial sum = %d  computed in %d ms \r\n", sum, endTime - startTime);

        sum = 0;
        startTime = System.currentTimeMillis();


        ArraySummingThread[] threads = new ArraySummingThread[NB_OF_THREADS];
        for (int i = 0; i < NB_OF_THREADS; i++) {
            threads[i] = new ArraySummingThread(array,
                    i * NB_OF_ELEMENTS / NB_OF_THREADS,
                    (i + 1) * NB_OF_ELEMENTS / NB_OF_THREADS);
            threads[i].start();
        }

// AȘTEPTĂM CA TOATE THREADURILE SĂ TERMINE
        for (int i = 0; i < NB_OF_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

// Abia acum e sigur să adunăm sumele
        for (int i = 0; i < NB_OF_THREADS; i++) {
            sum += threads[i].getSum();
        }

        endTime = System.currentTimeMillis();
        System.out.printf("Thread array sum = %d  computed in %d ms \r\n", sum, endTime - startTime);

          sum  = 0;
          startTime = System.currentTimeMillis();

          ExecutorService threadPool = Executors.newFixedThreadPool(NB_OF_THREADS);
          threads = new ArraySummingThread[NB_OF_THREADS];

          for (int i = 0; i < NB_OF_THREADS; i++) {
          threads[i] = new ArraySummingThread(array,i* NB_OF_ELEMENTS/NB_OF_THREADS,(i+1) * NB_OF_ELEMENTS/NB_OF_THREADS);
          threadPool.execute(threads[i]);
          }

          threadPool.shutdown();

        try {
            threadPool.awaitTermination(30, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < NB_OF_THREADS; i++) {
            sum+= threads[i].getSum();
        }


        endTime = System.currentTimeMillis();

        System.out.printf("Threadpool sum = %d  computed in %d ms \r\n", sum, endTime - startTime);


        sum = 0;
        startTime = System.currentTimeMillis();

        ArraySummingCallable[] callables = new ArraySummingCallable[NB_OF_THREADS];



            List<Future<Long>> results = new ArrayList<>();
            threadPool = Executors.newFixedThreadPool(NB_OF_THREADS);

            for(int i = 0; i<NB_OF_THREADS;i++){
                callables[i]= new ArraySummingCallable(array,i*NB_OF_ELEMENTS/NB_OF_THREADS,(i+1) * NB_OF_ELEMENTS/NB_OF_THREADS);
                results.add(threadPool.submit(callables[i]));

            }
        threadPool.shutdown();


        for(Future<Long> f: results){
            try {
                sum +=f.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        endTime = System.currentTimeMillis();

        System.out.printf("Callable sum = %d  computed in %d ms \r\n", sum, endTime - startTime);
    }
}
