package Job01;

import java.util.ArrayList;
import java.util.List;

public class ListeEntiers {
    public static void main(String[] args) {
        List<Integer> nbListe = new ArrayList<>();

        for(int i=0;i< args.length;i++) {
            nbListe.add(Integer.parseInt(args[i]));
        }

        int sum = 0;

        for(int i=0;i< nbListe.size();i++) {
            if((nbListe.get(i) % 2) == 0){
                sum+= nbListe.get(i);
            }
        }

        System.out.println("somme des nombres pairs: "+ sum);

    }
}
