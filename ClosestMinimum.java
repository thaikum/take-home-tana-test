import java.util.stream.IntStream;

public class ClosestMinimum {
    /**
     * This functions gets the minimum then iterates through the elements of the array
     * while calculating the distance between the previous and the current index.
     * It updates the minimum distance to the least of the two distances.
     *
     * @param arr - the input array
     * @return - the closest distance of the minimum numbers in an array.
     */
    public static int closestMinimum(int[] arr) {
        int min = IntStream.of(arr).min().getAsInt();
        int minimumDistance = Integer.MAX_VALUE;
        int previousLocation = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                if (previousLocation != -1) {
                    minimumDistance = Math.min(minimumDistance, i - previousLocation);
                }
                previousLocation = i;
            }
        }
        return minimumDistance == Integer.MAX_VALUE ? -1 : minimumDistance;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 1, 2, 3, 1, 4, 1, 7};
        int result = closestMinimum(numbers);
        System.out.println("Closest distance between minimum values: " + result);
    }

}
