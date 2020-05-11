package intermediate;

import static core.MyCore.toastln;
import java.util.*;

public class Hash {

    public static void main(String[] args) {

        HashMap<String, String> ham = new HashMap<>();

        ham.put("Tony", "tony@knust.edu");
        ham.put("Theo", "theo@knust.edu");
        ham.put("Yankey","yan@knust.edu");
        ham.put("Fred", "fred@knust.edu");
        ham.put("Fiifi", "fifi@knust.edu");

        toastln(ham.size());

        ham.remove("Fred");
        toastln(ham.get("Tony"));
        toastln();

        ham.keySet().stream().forEach((s) -> {
            toastln(s);
        });

        toastln();

        ham.values().stream().forEach((s) -> {
            toastln(s);
        });
        toastln();

        ham.entrySet().stream().forEach((pairs) -> {
            System.out.println(pairs);
        });

    }
}
