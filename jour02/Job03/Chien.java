package Job03;

public class Chien extends Animal {
    @Override
    void faireDuBruit() {
        System.out.println("le chien aboie");
    }

    public static void main(String[] args) {
        Chien krypto = new Chien();
        krypto.faireDuBruit();
    }
}
