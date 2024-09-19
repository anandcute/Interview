import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean divisible3 = i % 3 == 0 ;
            boolean divisible5 = i % 5 == 0 ;
            if(divisible3 && divisible5)
                result.add("FizzBuzz");
            else if(divisible3)
                result.add("Fizz"); 
            else if (divisible5)
                result.add("Buzz");
            else
                result.add(String.valueOf(i));    
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 15 ;
        FizzBuzz fb = new FizzBuzz();
        // System.out.println(fb.fizzBuzz(n));
        List<String> result = new ArrayList<>();
        // type 2
        String str = " "; 
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0)
                str = "FizzBuzz";
            else if(i % 3 == 0 )
                str = "Fizz" ; 
            else if (i % 5 == 0)
                str = "Buzz" ;
            else
                str = String.valueOf(i) ;    
            result.add(str);
            }
        System.out.println(result);
    }
}
