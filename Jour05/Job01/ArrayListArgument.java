package Job01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListArgument {
    public static void main(String[] args) {
        List<String> arguments = new ArrayList<>();
        for (String arg: args) {
            arguments.add(arg);
        }

        for (String arg: arguments) {
            System.out.println(arg);
        }

    }
}
