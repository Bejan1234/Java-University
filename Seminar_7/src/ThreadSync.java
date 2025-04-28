 public class ThreadSync extends Thread{

        private static final Object Lock=new Object();
        private static int a =0;
        private static int b =0;

        public ThreadSync(String threadName){
            super(threadName);
        }
        private void myMethod(){
            synchronized (Lock){
            System.out.println("Thread "+getName()+"; a = "+a+"; b = "+b);
            a++;

            try {
                sleep((int)(Math.random()*1000));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            b++;

        }
        }

        @Override
        public void run() {
            for(int i=0;i<3;i++){
                this.myMethod();
            }
        }
    }
