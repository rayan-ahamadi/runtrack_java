public class CompteBancaire {
    private int solde;

    public CompteBancaire(int solde){
        this.solde = solde;
    }

    public void getSolde() {
        System.out.println("Solde actuel : " + solde);
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
    public static void main(String[] args) {
        CompteBancaire myCompte = new CompteBancaire(100);
        myCompte.getSolde();
        myCompte.depot(50);
        myCompte.retrait(70);
        myCompte.retrait(90);

    }
}
