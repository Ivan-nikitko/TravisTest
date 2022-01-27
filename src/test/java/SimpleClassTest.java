import by.example.example.SimpleClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleClassTest {


    @Test
    public void calcTest() {
        SimpleClass simpleClass = new SimpleClass();
        Integer result = simpleClass.sum(4, 3);
        Integer expected =7;
        assertEquals(expected,result);
    }
}
