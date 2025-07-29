import java.util.*;
public class UniquePair {
    public static List<List<Integer>> uniquePairs(int[] numbers, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> uniquePairs = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int number : numbers) {
            int complement = target - number;
            if (seen.contains(complement)) {
                // Create a unique pair representation
                String pair = Math.min(number, complement) + "," + Math.max(number, complement);
                if (!uniquePairs.contains(pair)) {
                    uniquePairs.add(pair);
                    result.add(Arrays.asList(Math.min(number, complement), Math.max(number, complement)));
                }
            }
            seen.add(number);
        }
        return result;
    }
    public static void main(String[] args) {
        // int taget = 10; // Example target sum
        // ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)); // Example list of numbers
        // Set<String> uniquePairs = new HashSet<>();
        // for (int i = 0; i < numbers.size(); i++) {
        //     for (int j = i + 1; j < numbers.size(); j++) {
        //         if (numbers.get(i) + numbers.get(j) == taget) {
        //             // Create a unique pair representation
        //             String pair = "(" + numbers.get(i) + ", " + numbers.get(j) + ")";
        //             uniquePairs.add(pair);
        //         }
        //     }
        // }

        // // Print the unique pairs
        // System.out.println("Unique pairs that sum to " + taget + ":");
        // for (String pair : uniquePairs) {
        //     System.out.println(pair);
        // }

        int target = 10; // Example target sum
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Example array of numbers
        List<List<Integer>> result= uniquePairs(numbers, target);
        System.out.println(result);
    }
}
