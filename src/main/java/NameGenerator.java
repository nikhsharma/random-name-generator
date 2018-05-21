import java.util.ArrayList;
import java.util.Collections;

public class NameGenerator {
    private static ArrayList<String> names = new ArrayList<String>();

    public static ArrayList<String> getNames() {
        return names;
    }

    public static void addNameToList(String name) {
        names.add(name);
    }

    public static String oneRandomName() {
        Collections.shuffle(names);
        return names.get(0);
    }
}
