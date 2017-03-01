public class opdracht30_4 {

    public static void main(String args[]) {
        for (int i = 0; i < 1000; i++) {
            Threads t = new Threads();
            (new Thread(t)).start();
        }

    }
}

class Threads implements Runnable {
    int a = 0;
    public synchronized void run() {
        System.out.println(a);
        a++;
    }
}
