import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total 'n' : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int k = sc.nextInt();
        int reArray[] = new int[n];
        int index = 0;

        for(int i = k+1 ; i < n ; i++){
            reArray[index++] = array[i];
        }
        for(int i=0 ; i <= k ; i++){
            reArray[index++] = array[i];
        }
        System.out.println(Arrays.toString(reArray) );
    }
}
