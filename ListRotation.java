import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListRotation {
    /**
     * This function rotates a list n times.
     * It is know that rotating the elements when n = list size then the list is the same so we can use the modulus to avoid overrotating.
     * If we pick n elements from the last elements and bring them in front, then the whole list is rotated.
     *
     * @param words - words to be rotated
     * @param n     - times to rotate the words
     * @return - the final rotated list.
     */
    public static List<String> rotateList(List<String> words, int n) {
        if(words.size() <= 1){
            return words;
        }

        n = n % words.size();
        return Stream.concat(
                words.subList(words.size() - n, words.size()).stream(),
                words.subList(0, words.size() - n).stream()
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "pear");
        int rotations = 2;
        List<String> result = rotateList(words, rotations);
        System.out.println("Original list: " + words);
        System.out.println("List after " + rotations + " rotations: " + result);
    }

}
