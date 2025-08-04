import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GetLongestStringTest {

    @Test
    void testEmptyInput() {
        List<Character> validChars = Arrays.asList('a', 'b', 'c');
        String[] strings = {};
        assertEquals("", GetLongestString.getLongestString(validChars, strings));
    }

    @Test
    void testValidInput() {
        List<Character> validChars = Arrays.asList('a', 'b', 'c');
        String[] strings = {"abc", "ab", "bc" };
        assertEquals("abc", GetLongestString.getLongestString(validChars, strings));
    }

    @Test
    void testInvalidCharacters() {
        List<Character> validChars = Arrays.asList('a', 'b');
        String[] strings = {"abc", "ab" };
        assertEquals("ab", GetLongestString.getLongestString(validChars, strings));
    }


    @Test
    void testNoValidStrings() {
        List<Character> validChars = Arrays.asList('a', 'b');
        String[] strings = {"cc", "dd" };
        assertEquals("", GetLongestString.getLongestString(validChars, strings));
    }
}
