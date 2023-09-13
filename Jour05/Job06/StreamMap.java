package Job06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String> nombre = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            nombre.add(args[i]);
        }

        System.out.println(nombre.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}
