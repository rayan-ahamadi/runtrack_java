import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom : ");
        String name = myScanner.nextLine();

        System.out.println("Hello, " + name);
    }
}
