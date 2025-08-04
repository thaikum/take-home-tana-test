import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListRotationTest {

    @Test
    void testBasicRotation() {
        List<String> input = Arrays.asList("ID_A01","ID_A02","ID_A03","ID_A04","ID_A05","ID_A06");
        List<String> expected = Arrays.asList("ID_A05","ID_A06","ID_A01","ID_A02","ID_A03","ID_A04");
        assertEquals(expected, ListRotation.rotateList(input, 2));
    }

    @Test
    void testRotationWithLargeN() {
        List<String> input = Arrays.asList("A", "B", "C");
        List<String> expected = Arrays.asList("B", "C", "A");
        assertEquals(expected, ListRotation.rotateList(input, 5));
    }

    @Test
    void testSingleElementList() {
        List<String> input = List.of("A");
        List<String> expected = List.of("A");
        assertEquals(expected, ListRotation.rotateList(input, 1));
    }
}
