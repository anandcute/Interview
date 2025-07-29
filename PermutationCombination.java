public class PermutationCombination {

    // Function to calculate factorial
    public static int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Function to calculate nCr (Combination)
    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Function to calculate nPr (Permutation)
    public static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        int n = 11;
        int r = 10;
        
        int nCr = combination(n, r);
        int nPr = permutation(n, r);
        
        System.out.println("Combination (C(" + n + "," + r + ")) = " + nCr);
        System.out.println("Permutation (P(" + n + "," + r + ")) = " + nPr);
    }
}
