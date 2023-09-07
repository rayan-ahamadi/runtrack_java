public class VoitureTest {
    private String marque;
    private String couleur;
    private int vitesse;

    public VoitureTest(String marque, String couleur, int vitesse) {
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

    public void freinage(){
        vitesse = 0;
        System.out.println("La voiture s'arrête, vitesse reinitialisé à " + vitesse + " km/h");
    }
    public static void main(String[] args) {
        VoitureTest voiture1 = new VoitureTest("prout","violet",0);
        voiture1.demarrer();
        voiture1.acceleration();
        voiture1.freinage();
    }
}
