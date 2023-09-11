package Job01;

public class SimpleThread extends Thread {

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Salut du Thread !");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("erreurs: " + e);
            }

        }
    }



    public static void main(String[] args) {
        SimpleThread thread = new SimpleThread();
        SimpleThread thread1 = new SimpleThread();
        thread.start();
        thread1.start();
    }
}
