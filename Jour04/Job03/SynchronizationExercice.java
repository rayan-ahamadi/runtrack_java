package Job03;

public class SynchronizationExercice {
    private int solde;

    synchronized void retrait(int montant){
        if (solde >= montant){
            solde -= montant;
            System.out.println("Retrait effectué: " + montant + " euros");
            System.out.println("Votre solde: " + solde);
        }
        else {
            System.out.println("Solde insuffisant.");
        }
    }

    public SynchronizationExercice(int solde){
        this.solde = solde;
    }


    public static void main(String[] args) {
        SynchronizationExercice se = new SynchronizationExercice(200);
        Thread thread1 = new Thread(() -> {se.retrait(Integer.parseInt(args[0]));} );
        Thread thread2 = new Thread(() -> {se.retrait(Integer.parseInt(args[1]));} );

        thread1.start();
        thread2.start();

    }

}
