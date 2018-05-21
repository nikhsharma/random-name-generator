import org.junit.Before;
import org.junit.Test;

import javax.naming.Name;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NameGeneratorTest {

    ArrayList<String> name;
    ArrayList<String> names;

    @Before
    public void before() throws Exception {
        names = new ArrayList<String>();
        name = new ArrayList<String>();
    }

//    @Test
//    public void canAddNameToList() {
//        NameGenerator.addNameToList("Bob");
//        NameGenerator.addNameToList("Glob");
//        NameGenerator.addNameToList("Dob");
//        assertEquals(3, NameGenerator.getNames().size());
//    }

//    @Test
//    public void canReturnOneRandomName() {
//        NameGenerator.addNameToList("Dob");
//        name.add(NameGenerator.oneRandomName());
//        assertEquals(1, name.size());
//    }
//
   @Test
    public void canReturnTwoRandomName() {
        NameGenerator.addNameToList("Dob");
        NameGenerator.addNameToList("Bob");
        NameGenerator.addNameToList("Bob");
        assertEquals(2, NameGenerator.twoRandomNames().size());
    }
}
