package Job07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args) {
        List<Integer> nombre = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            nombre.add(Integer.parseInt(args[i]));
        }

        System.out.println("Nombre inférieur à " + args[0] + ": " + nombre.stream().filter(nb -> nb < Integer.parseInt(args[0])).collect(Collectors.toList()) );


    }
}
