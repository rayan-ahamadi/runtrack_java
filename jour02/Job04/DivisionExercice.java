package Job04;

public class DivisionExercice {

    public static void verifDiv(int valeur){
        if (valeur == 0){
            throw new IllegalArgumentException("DivisionParZeroException");
        }
    }
    public static void main(String[] args) {
        if (Integer.parseInt(args[1]) == 0){
            try {
                verifDiv(Integer.parseInt(args[1]));
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur: " + e);
            }

        } else{
            int div = Integer.parseInt(args[0]) /  Integer.parseInt(args[1]);
            System.out.println("Résultat : " + div);
        }



    }
}
