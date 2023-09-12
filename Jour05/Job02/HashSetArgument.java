package Job02;

import java.util.HashMap;
import java.util.Map;

public class HashSetArgument {
    public static void main(String[] args) {
        HashMap<String,Integer> arg = new HashMap<>();
        int i=0;
        for (String a: args) {
            arg.put(a,i);
            i++;
        }


        for (Map.Entry m : arg.entrySet()) {
            System.out.println(m.getKey());
        }

    }
}
