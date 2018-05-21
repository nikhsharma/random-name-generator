import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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

    public static List<String> twoRandomNames() {
        Collections.shuffle(names);
        List<String> results = new ArrayList<String>();
        results.add(names.get(0));
        results.add(names.get(1));
        return results;
    }
}
