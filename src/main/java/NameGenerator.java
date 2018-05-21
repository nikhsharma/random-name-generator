import java.util.ArrayList;

public class NameGenerator {
    private static ArrayList<String> names = new ArrayList<String>();


    public static ArrayList<String> getNames() {
        return names;
    }

    public static void addNameToList(String name) {
        names.add(name);
    }

}
