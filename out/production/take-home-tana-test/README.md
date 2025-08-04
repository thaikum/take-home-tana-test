## Requirements:
- Java 17
- JUnit5: For the test cases.


## Question 1
The `getLongestString` function finds the longest string from an array that contains only valid characters and has no repeating adjacent characters. It uses a Set for efficient character lookup and Stream operations for filtering and comparison.

## Question 2
The `uniqueSums` function calculates the number of possible ways to achieve a target sum using given numbers. It uses dynamic programming with a tracker array to keep count of possible combinations for each intermediate sum.

## Question 3
The `arrayZero` function checks if all elements (except the first) in an array can be reduced to 0 by repeatedly subtracting either the previous element or the GCD of the previous two elements. Returns 1 if possible, 0 if not.

## Question 4
The `firstUniqueProduct` function finds the first product that appears exactly once in the array. It uses a `LinkedHashSet` to maintain order while adding unique products and removing duplicates, returning the first remaining element.

## Question 5
The `closestMinimum` function finds the smallest distance between any two occurrences of the minimum value in an array. It first finds the minimum value, then tracks positions of minimum values to calculate the smallest gap.

## Question 6
The `threeMostCommonStrings` function finds the three most frequently occurring words in a sentence. It splits the sentence, groups words by count, sorts by frequency (descending) and alphabetically, then returns top 3.

## Question 7
The `rotateList` function rotates a list by `n` positions. It optimizes rotation by using modulus to avoid over-rotating, then concatenates the last n elements with the remaining elements to create the rotated list.


# Compilation & Execution
All Question files contain a simple main function for test purposes.
Use the below command to run the individual files.
```shell
java <file_name>
```

For the test files, download the `org.junit.jupiter` version 5.8.1 jar file.
Use the below command to compile them:
```shell
javac -classpath <location of the JUnit jar file> <test_file>
```