import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 4};
        // List<Integer> sums = findUniqueCombinationsSum(arr);
        List<List<Integer>> combinations = findUniqueCombinations(arr);

        // for (int sum : sums) {
        //     System.out.println(sum);
        // }

        for (List<Integer> list : combinations) {
            System.out.println(list.toString());
        }

    }

    public static List<List<Integer>> findUniqueCombinations(int[] arr) {
 
        List<List<Integer>> numbers = new ArrayList<>();
        int n = arr.length;

        for (int i = 1; i < (1 << n); i++) {
            List<Integer> nums = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    nums.add(arr[j]);
                }
            }
            numbers.add(nums);
        }

        return numbers;
    }

    public static List<Integer> findUniqueCombinationsSum(int[] arr) {
        List<Integer> sums = new ArrayList<>();
        int n = arr.length;

        for (int i = 1; i < (1 << n); i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {          
                    // i=1 => 001 Subset containing element 1
                    // i=2 => 010 Subset containing element 2
                    // i=3 => 011 Subset containing element 1 and 2
                    // i=4 => 100 Subset containing element 3
                    sum += arr[j];
                }
            }
            sums.add(sum);
        }

        return sums;
    }
}
