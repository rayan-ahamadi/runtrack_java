import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Entrez le premier nombre");
        float nb1 = myScanner.nextFloat();
        System.out.println("Entrez le deuxième nombre");
        float nb2 = myScanner.nextFloat();

        System.out.println("somme : " + (nb1 + nb2));
        System.out.println("Différence : " + (nb1 * nb2));
        System.out.println("Produit : " + (nb1 + nb2));
        System.out.println("Division : " + (nb1 / nb2));
    }
}
