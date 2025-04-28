public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

//        ThreadNonSync t1= new ThreadNonSync("T1");
//        ThreadNonSync t2= new ThreadNonSync("T2");
//
//        t1.start();
//        t2.start();

        ThreadSync t01=new ThreadSync("TB1");
        ThreadSync t02=new ThreadSync("TB2");
        ThreadSync t03=new ThreadSync("TB3");

        t01.start();
        t02.start();

        t01.join();
        t02.join();



        System.out.println("Main finished");
    }
}
