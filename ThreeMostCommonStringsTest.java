import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThreeMostCommonStringsTest {

    @Test
    void testNormalCase() {
        String input = "apple banana apple orange banana apple orange";
        String[] expected = {"apple", "banana", "orange" };
        assertArrayEquals(expected, ThreeMostCommonStrings.threeMostCommonStrings(input));
    }

    @Test
    void testLessThanThreeWords() {
        String input = "apple apple banana";
        String[] expected = {"apple", "banana" };
        assertArrayEquals(expected, ThreeMostCommonStrings.threeMostCommonStrings(input));
    }

    @Test
    void testSingleWord() {
        String input = "apple";
        String[] expected = {"apple" };
        assertArrayEquals(expected, ThreeMostCommonStrings.threeMostCommonStrings(input));
    }

    @Test
    void testEmptyString() {
        String input = "";
        String[] expected = {};
        assertArrayEquals(expected, ThreeMostCommonStrings.threeMostCommonStrings(input));
    }

    @Test
    void testEqualFrequencies() {
        String input = "apple banana orange";
        String[] expected = {"apple", "banana", "orange" };
        assertArrayEquals(expected, ThreeMostCommonStrings.threeMostCommonStrings(input));
    }
}
