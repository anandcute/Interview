public class NumberOfOccuerence {

    public int valuesOfNum(int x, int arr[]) {

        // Number of occuerence (X value evlo time iruko atha count return pananum)
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count += 1;
            }

        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 2, 5, 3, 2, 8 };

        NumberOfOccuerence n = new NumberOfOccuerence();
        
        System.out.println(n.valuesOfNum(2, arr));
    }
}
// output (value coount value of x)
// so answer is 4