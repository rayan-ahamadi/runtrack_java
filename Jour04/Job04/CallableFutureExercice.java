package Job04;

import java.util.concurrent.*;

public class CallableFutureExercice implements Callable {
    int nb1;
    int nb2;

    public CallableFutureExercice(int nb1,int nb2){
        this.nb1 = nb1;
        this.nb2 = nb2;
    }

    @Override
    public Integer call() throws Exception {
        return nb1 * nb2;
    }

    public static void main(String[] args) {
        int nombre1 = Integer.parseInt(args[0]);
        int nombre2 = Integer.parseInt(args[1]);

        // Création d'un ExecutorService avec un seul thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Création d'une instance de MultiplicationCallable
        CallableFutureExercice multiplicationTask = new CallableFutureExercice(nombre1, nombre2);

        // Soumission de la tâche à l'ExecutorService
        Future<Integer> futureResultat = executor.submit(multiplicationTask);

        try {
            // Récupération du résultat
            int resultat = futureResultat.get();
            System.out.println("\nLe résultat de la multiplication est : " + resultat);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Arrêt de l'ExecutorService
        executor.shutdown();
    }
}





