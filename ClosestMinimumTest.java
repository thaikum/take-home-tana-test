import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClosestMinimumTest {

    @Test
    void testTwoMinimumValues() {
        int[] arr = {4, 1, 3, 1, 5};
        assertEquals(2, ClosestMinimum.closestMinimum(arr));
    }

    @Test
    void testMultipleMinimumValues() {
        int[] arr = {5, 1, 2, 1, 3, 1};
        assertEquals(2, ClosestMinimum.closestMinimum(arr));
    }

    @Test
    void testSingleMinimumValue() {
        int[] arr = {5, 2, 1, 4, 6};
        assertEquals(-1, ClosestMinimum.closestMinimum(arr));
    }

    @Test
    void testAllSameValues() {
        int[] arr = {2, 2, 2, 2, 2};
        assertEquals(1, ClosestMinimum.closestMinimum(arr));
    }

    @Test
    void testMinimumValuesAtEnds() {
        int[] arr = {1, 3, 4, 5, 1};
        assertEquals(4, ClosestMinimum.closestMinimum(arr));
    }
}
