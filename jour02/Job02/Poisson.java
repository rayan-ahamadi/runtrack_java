package Job02;

public class Poisson implements Nageur {

    public void nager() {
        System.out.println("Le Poisson nage rapidement");
    }

    public static void main(String[] args) {
        Poisson poisson = new Poisson();
        poisson.nager();
    }

}
