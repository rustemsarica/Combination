## Java Program to Find Unique Combinations and their Sums

This Java program is used to find the unique combinations and their sums of an integer array. The program consists of two functions named findUniqueCombinations and findUniqueCombinationsSum.

## findUniqueCombinations

This function finds all the unique combinations of a given integer array arr and returns the results in a list. The function generates the combinations by converting the elements of the arr array into binary numbers and using bitwise operations to create the combinations.

## findUniqueCombinationsSum

This function calculates the sums of the unique combinations of a given integer array arr and returns the results in a list. It utilizes the findUniqueCombinations function to obtain the combinations and calculates their sums.

## Usage

The program operates on an integer array int[] arr, and it finds the unique combinations and their sums using the findUniqueCombinations and findUniqueCombinationsSum functions.


## Mathematical Insight

- The program utilizes the expression 1 << n (2 to the power of n) to calculate the combinations. Consequently, the size of the array must be n. As the array size increases, the number of combinations grows exponentially. Thus, it is essential to be cautious when using large arrays to consider performance.

- The program generates combinations using binary numbers and bitwise operations. Each combination is represented by a unique binary number, where each bit position corresponds to an element of the arr array. If the bit is set (1), the corresponding element is included in the combination; otherwise, it is excluded.

- The sum of each combination is calculated by iterating through the binary number and adding the corresponding elements of the arr array based on the set bits (1s) in the binary number.

- The program efficiently handles all possible combinations without explicitly generating the power set of the array. This approach significantly reduces the time complexity compared to more naive approaches.
