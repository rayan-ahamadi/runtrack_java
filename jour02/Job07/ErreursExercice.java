package Job07;

public class ErreursExercice {
    public static void main(String[] args) {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Erreur : NullPointerException : " + e.getMessage());
        }

        try {
            int[] tableau = new int[5];
            int valeur = tableau[10];
        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Erreur : ArrayIndexOutOfBoundsException : " + e1.getMessage());
        }

        try {
            int division = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
        }catch(ArithmeticException e2) {
            System.out.println("Résultat de la division : erreur : " + e2.getMessage());
        }


    }
}
