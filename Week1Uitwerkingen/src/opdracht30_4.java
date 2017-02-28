public class opdracht30_4 implements Runnable {
    public void run() {
        System.out.println("This is a test.");
    }

    public static void main(String args[]) {
        for (int i = 0; i < 1000; i++) {
            (new Thread(new opdracht30_4())).start();
        }

    }
}
