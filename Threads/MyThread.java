import java.lang.*;

public class MyThread implements Runnable{
    protected int init;
    protected int increment;
    protected int delay;

    public MyThread(int init, int increment, int delay) {
        this.init = init;
        this.increment = increment;
        this.delay = delay;
    }
    public void run() {
        try {
            for(;;) {
                System.out.println(init+" ");
                init+= increment;
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {

        }
    }
}
