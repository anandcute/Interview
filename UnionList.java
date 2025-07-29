import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UnionList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5,6,7,8));
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < list1.size(); i++){
            ans.add(list1.get(i));
        }
        for(int i = 0 ; i < list2.size(); i++){
            ans.add(list2.get(i));
        }
        Collections.sort(ans);

        System.out.println(ans);
    }
}
