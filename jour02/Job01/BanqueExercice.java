package Job01;

class CompteBancaire {
    private float solde;
    private float soldeEpargne;
    private float tauxInteret;


    public CompteBancaire(int solde,int soldeEpargne,int tauxInteret){
        this.solde = solde;
        this.soldeEpargne = soldeEpargne;
        this.tauxInteret = tauxInteret;
    }
    void ajoutInteret() {
        float intérêt = (solde * (tauxInteret / 100));
        solde += intérêt;

        System.out.println("Intérêt ajoutés: " + intérêt + ", solde épargne à " + solde);
    }

    public void getSolde() {
        System.out.println("Solde actuel du compte courant : " + solde);
        System.out.println("Solde actuel du compte épargne : " + soldeEpargne + " Avec taux d'intérêt de " + tauxInteret);
    }

    public void depot(int montant){
        solde+=montant;
        System.out.println(montant + "euros déposés. Nouveau solde : " + solde);
    }

    public void retrait(int montant){
        if (montant > solde){
            System.out.println("tentative de retrait de " + montant + "euros... SOLDE INSUFFISANT !");

        } else {
            solde -= montant;
            System.out.println(montant + "euros retirés. Nouveau solde : " + solde);
        }
    }
}
public class BanqueExercice extends CompteBancaire  {

    public BanqueExercice(int solde,int soldeEpargne,int tauxInteret) {
        super(solde,soldeEpargne,tauxInteret);
    }


    public static void main(String[] args) {
        CompteBancaire myCompte = new CompteBancaire(100,200,2);
        myCompte.getSolde();
        myCompte.depot(50);
        myCompte.retrait(70);
        myCompte.retrait(90);
        myCompte.ajoutInteret();
    }


}
