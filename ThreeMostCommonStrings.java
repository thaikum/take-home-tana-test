import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreeMostCommonStrings {
    /**
     * This function groups all the values in the string and gets the count.
     * The entry set is the sorted, according to the count, and the first three extracted
     * the stream are sorted alphabetically and returned as an array.
     *
     * @param sentence -  the sentence to extract the three most appearing words.
     * @return - an array of the three most appearing strings
     */
    public static String[] threeMostCommonStrings(String sentence) {
        if(sentence == null || sentence.isBlank()){
            return new String[]{};
        }
        return Stream.of(sentence.split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .sorted()
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String sentence = "apple banana apple orange banana apple pear";
        String[] result = threeMostCommonStrings(sentence);
        System.out.println("Three most common words: " + String.join(", ", result));
    }

}
