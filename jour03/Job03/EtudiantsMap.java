package Job03;

import java.util.HashMap;
import java.util.Map;

public class EtudiantsMap {
    public static void main(String[] args) {
        Map<Integer,String> Etudiant = new HashMap();

        Etudiant.put(101,"Pierre");
        Etudiant.put(102,"Marie");
        Etudiant.put(103,"Jean");

        System.out.println(Etudiant.get(102));
        System.out.println(Etudiant);

        for (Map.Entry<Integer, String > entry : Etudiant.entrySet()) {
            Integer cle = entry.getKey();
            String valeur = entry.getValue();
            System.out.println(cle + ": " + valeur);
        }


    }
}
