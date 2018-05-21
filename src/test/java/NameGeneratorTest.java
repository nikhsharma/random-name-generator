import org.junit.Test;

import javax.naming.Name;

import static org.junit.Assert.assertEquals;

public class NameGeneratorTest {

    @Test
    public void canAddNameToList() {
        NameGenerator.addNameToList("Bob");
        assertEquals(1, NameGenerator.getNames().size());
    }
}
