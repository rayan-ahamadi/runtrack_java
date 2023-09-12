package Job04;


public class LambdaArgument {
    public static void main(String[] args) {
        String mot = args[0];
        int longueur = Integer.parseInt(args[1]);

         Runnable isLong = () -> {
            if (mot.length() > longueur) {
                System.out.println("La chaîne est plus longue que " + longueur);
            }else {
                System.out.println("La chaîne n'est pas plus longue que " + longueur);
            }
        };

         isLong.run();

    }
}
