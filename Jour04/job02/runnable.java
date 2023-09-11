package job02;

public class runnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("En cours d'exécution...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        runnable run = new runnable();
        Thread thread = new Thread(run);
        Thread thread1 = new Thread(run);

        thread.start();
        thread1.start();
    }

}
