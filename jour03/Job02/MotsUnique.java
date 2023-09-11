package Job02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MotsUnique {
    public static void main(String[] args) {
        List<String> motsListe = new ArrayList<>();

        for(int i=0;i< args.length;i++) {
            motsListe.add(args[i]);
        }

        List<String> listUnique = new ArrayList<>();
        for(int i=0;i< motsListe.size();i++) {
           int it = 0;
           String unMot = motsListe.get(i);

           for(int j=0;j< motsListe.size();j++){
               if (Objects.equals(unMot, motsListe.get(j))) {
                   it += 1;
               }
           }

            if (it < 2){
                listUnique.add(unMot);
            }

        }

        System.out.println("Les mots uniques : " + listUnique);

    }
}
