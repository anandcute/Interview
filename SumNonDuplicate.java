import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumNonDuplicate {

    public static int sumOfUnqiue(int array[]){
        Arrays.sort(array);
        int n = array.length;
        int sum = 0 ;
        // method 1
        // for (int i = 0; i < n; ) {
        //     int count = 1;
        //     // Count how many times array[i] appears
        //     while (i + count < n && array[i] == array[i + count]) {
        //         count++;
        //     }

        //     if (count == 1) {
        //         sum += array[i];  // Unique element
        //     }

        //     i += count;  // Move to the next new number
        // }
        // method 2
        /*Map<Integer , Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num , map.getOrDefault(num, 0) + 1);
        }
        for ( Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                sum += entry.getKey();
            }
        }
            */
        return sum;
    } 
    public static void main(String[] args) {
        int[] array = {10,20,30,10,40,50,40,50};
        int result = sumOfUnqiue(array);
        System.out.println(result);
    }
}
