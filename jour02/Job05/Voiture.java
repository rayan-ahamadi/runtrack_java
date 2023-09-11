package Job05;

public class Voiture {
    private String marque;
    private String couleur;
    private int vitesse;

    public Voiture(String marque, String couleur, int vitesse) {
        this.marque = marque;
        this.couleur= couleur;
        this.vitesse = vitesse;
    }

    public void demarrer(){
        System.out.println("La voiture démarre");
    }

    public void acceleration(){
        vitesse+= 10;
        System.out.println("La vitesse est maintenant de " + vitesse + " km/h");
    }

    public void getVitesse(){
        System.out.println("La vitesse de la voiture : " + vitesse);
    }

    public void freinage(){
        vitesse = 0;
        System.out.println("La voiture s'arrête, vitesse reinitialisé à " + vitesse + " km/h");
    }
    public static void main(String[] args) {
        Voiture voiture = new Voiture("voiture","bleu",Integer.parseInt(args[0]));

        if (Integer.parseInt(args[0]) > 100) {
            try {
                throw new IllegalArgumentException("VitesseLimiteDepasseException");
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur " + e);
            }
        }else {
            voiture.getVitesse();
        }


    }
}
