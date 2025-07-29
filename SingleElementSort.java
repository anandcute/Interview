
import java.util.*;

public class SingleElementSort {
    // Method 1
    public static int findSingleElement(int[] arr) {
        int result = 0; 
        // XOR all elements in the array
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
    // Method 2
    public static int findSingleElement2(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i += 2) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return -1; 
    }
    // Method 3
    public static int findSingleElement3(int array[]){
        Map<Integer , Integer> map = new HashMap<>();
        for(int i : array){
            map.put(i , map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2, 3, 4, 5, 1 , 4 ,3, 5};
        int singleElement = findSingleElement(arr);
        // System.out.println("The single element is: " + singleElement);
        // System.out.println( findSingleElement2(arr));
        System.out.println( findSingleElement3(arr));
    }
}
