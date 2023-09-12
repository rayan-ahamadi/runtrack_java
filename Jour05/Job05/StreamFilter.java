package Job05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        List<Integer> nombre = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            nombre.add(Integer.parseInt(args[i]));
        }


        System.out.println("Nombres supérieurs à " + value + " :" + nombre.stream().filter(num -> num > value).collect(Collectors.toList()));
    }
}
