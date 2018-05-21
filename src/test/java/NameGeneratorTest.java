import org.junit.Before;
import org.junit.Test;

import javax.naming.Name;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NameGeneratorTest {

    ArrayList<String> name;

    @Before
    public void before() throws Exception {
        NameGenerator.addNameToList("Bob");
        NameGenerator.addNameToList("Glob");
        NameGenerator.addNameToList("Dob");
        name = new ArrayList<String>();
    }

    @Test
    public void canAddNameToList() {
        assertEquals(3, NameGenerator.getNames().size());
    }

//    @Test
//    public void canReturnOneRandomName() {
//        name.add(NameGenerator.oneRandomName());
//        assertEquals(1, name.size());
//    }
}
