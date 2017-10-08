public class SomeTask implements Runnable {
    public void run(){
        System.out.println(" Thread name = " + Thread.currentThread().getName());
    }
}