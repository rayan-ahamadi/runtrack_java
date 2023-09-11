package Job02;

public class Homme implements Job02.Nageur {

    public void nager() {
        System.out.println("L'homme nage");
    }

    public static void main(String[] args) {
        Homme homme = new Homme();
        homme.nager();
    }
}
