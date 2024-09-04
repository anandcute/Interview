public class NoOfDigits {

    public static void main(String[] args) {
         int  n = 101; 
         int r  , s = 0;
         int count = 0 ;

         while (n > 0 ){
           r = n % 10 ;
           s = s * 10 + r;
           count++;
           n = n / 10;  
        }
         System.out.println(count);
         System.out.println(s);
    }     
}