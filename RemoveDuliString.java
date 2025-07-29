import java.util.HashSet;
import java.util.Set;

public class RemoveDuliString {
    public String removeDuplicate(String s){
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello world";
        RemoveDuliString d = new RemoveDuliString();
        System.out.println(d.removeDuplicate(str));
    }
}
