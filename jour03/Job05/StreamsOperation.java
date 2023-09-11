package Job05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperation {
    public static void main(String[] args) {
        List<Integer> streamList = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            streamList.add(Integer.parseInt(args[i]));
        }

        List<Integer> result = streamList.stream()
                .map(nombre -> nombre * 2)
                .filter(nombre -> nombre > 10)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
