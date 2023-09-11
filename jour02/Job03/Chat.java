package Job03;

public class Chat extends Animal {

    @Override
    void faireDuBruit() {
        System.out.println("le chat miaule");
    }

    public static void main(String[] args) {
        Chat gyzmo = new Chat();
        gyzmo.faireDuBruit();
    }
}
