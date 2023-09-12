package Job03;

import java.util.HashMap;
import java.util.Map;

public class HashMapArgument {
    public static void main(String[] args) {
        HashMap<String, Object> mec = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            mec.put(args[i], args[i+1]);
            System.out.println(mec);
            i+=1;
        }

        System.out.println(mec);
        for (Map.Entry m : mec.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

    }
}