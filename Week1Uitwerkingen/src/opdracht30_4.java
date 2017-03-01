import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class opdracht30_4 {

    public static void main(String args[]) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Threads t = new Threads();
        for (int i = 0; i < 1000; i++) {
            executorService.execute(new Thread(t));
        }
    executorService.shutdown();
        while (!executorService.isTerminated()){
        }
        System.out.println("finished all");
    }
}

class Threads implements Runnable {
    private int a = 0;
    @Override
    public synchronized void run() {
        System.out.println("Thread called");
        a++;
        System.out.println(a);
    }
}
