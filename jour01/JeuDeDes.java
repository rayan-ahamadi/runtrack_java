import java.util.Random;
public class JeuDeDes {
    public static void main(String[] args) {
        Random random = new Random();
        int de1 = random.nextInt(0,6);
        int de2 = random.nextInt(0,6);
        int sum = de1 + de2;

        System.out.println("Dé 1: " + de1);
        System.out.println("Dé 2: " + de2);
        System.out.println("Somme :" + sum);
    }
}
