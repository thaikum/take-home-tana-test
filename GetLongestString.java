import java.util.*;
import java.util.stream.Stream;

public class GetLongestString {

    /**
     * This function first converts the list of characters to a set for efficiency during lookup.
     * It uses streams to first filter all strings containing only valid characters, then filter out
     * all strings containing repetitive pairs.
     * The result is then compared based on its length and the string with the maximum length returned.
     *
     * @param validCharacters - all valid characters to be checked
     * @param strings         - the strings to check
     * @return - the longest string from strings that has valid characters and does not contain a repeating pair
     */
    public static String getLongestString(List<Character> validCharacters, String[] strings) {
        Set<Character> validChars = new HashSet<>(validCharacters);

        return Stream.of(strings).filter((string) -> {
            for (char c : string.toCharArray()) {
                if (!validChars.contains(c)) {
                    return false;
                }
            }
            return true;
        }).filter(s -> {
            char prevChar = s.charAt(0);
            for (int i = 1; i < s.length(); i++) {
                if (prevChar == s.charAt(i)) {
                    return false;
                }
                prevChar = s.charAt(i);
            }
            return true;
        }).max(Comparator.comparingInt(String::length)).orElse("");
    }

    public static void main(String[] args) {
        List<Character> validChars = Arrays.asList('a', 'b', 'c');
        String[] strings = {"abc", "abbc", "abcb", "a", "ac"};
        String result = getLongestString(validChars, strings);
        System.out.println("Longest valid string: " + result);
    }

}