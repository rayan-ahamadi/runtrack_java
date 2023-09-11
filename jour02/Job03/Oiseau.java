package Job03;

import Job02.Poisson;

public class Oiseau extends Animal{
    @Override
    void faireDuBruit() {
        System.out.println("l'oiseau chante");
    }

    public static void main(String[] args) {
        Oiseau oizo = new Oiseau();
        oizo.faireDuBruit();
    }
}
