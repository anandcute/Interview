import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class SalesByMatch{

    public int sockMerchant(int n , int arr[]){
        Map<Integer,Integer> m = new HashMap<>();

        int pairs = 0 ;

        for (int sock : arr) {
            System.out.println("pAIR " + m.put(sock, m.getOrDefault(sock, 0) + 1));
        }

        for (int count : m.values()) {
            pairs += count/2;
        }

        return pairs;
    }
    public static void main(String[] args){
        SalesByMatch obj = new SalesByMatch();
        int arr[] = {10,20,20,10,10,30,50,10,20};
        int result = obj.sockMerchant(9, arr);

        System.out.println(result);

    }


}