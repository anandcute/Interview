
import java.util.Scanner;

//Qn1 Palindrome
class Interview {
    Scanner s = new Scanner(System.in);

    void getValue() {
        System.out.println("__________Prepartion of interview questions....!__________");
    }
}

class Palindrome extends Interview {
    public boolean isPalindrome(String str) {
        String rev = "";
        boolean flag = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            flag = true;

        }
        return flag;
    }

    public  int pali(int n) {
        int r, reve = 0;
        while (n > 0) {
            r = n % 10;
            n /= 10;
            reve = reve * 10 + r;
        }
        return reve;
    }
}

// Qn 2 Fibonacci series
class FibonacciSum extends Palindrome {
    public void fibonaci() {
        int n = 10;
        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print(" " + a);
        System.out.print(" " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
        System.out.println(" \n ");
    }

    public int fibonaciSum() {
        int n = 10;
        int a = 0;
        int b = 0;
        int c = 1;
        int sum = 1;
        if (n <= 0)
            sum = 0;
        for (int i = 2; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            sum += c;

        }
        return sum;
    }

}

// Qn 3 Prime or not
class PrimeSum extends FibonacciSum {
    public void primeNum(int n) {
        int flag = 0;
        if (n == 0 || n == 1) {
            System.out.println("Zero and one is not a prime no");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {

                    System.out.println(n + "not a prime num");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime num");
            }
        }
    }
}

// Qn 4 Odd Or Even
class OddOrEven extends PrimeSum {
    public void oddOrNot(int n) {
        if (n % 2 != 0) {
            System.out.println(n + " is a 0dd num");
        } else {
            System.out.println(n + " is a even num");
        }
    }

    public void oddOrEven(int n) {
        System.out.println("list of odd num 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("list of even num 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            System.out.print("");
        }
    }
    public void oddSum(int n) {
       

        int sum = 0;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
            System.out.print("\nsum of the odd num is  " + sum +" \n");
        } else {
            System.out.println("invalid number");
        }

    }

    public void evenSum(int n) {

        int sum = 0;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
            System.out.print("sum of the even num is " + sum + "\n");
        } else {
            System.out.println("invalid number");
        }
    }
}

// Qn 5 Natural numbers
class NaturalNum extends OddOrEven {
    public void naturalNo(int n) {

      //  while (true) {

            System.out.println("Enter the choice 1 to 2: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("print the n natural numbers:");
                    for (int i = 1; i <= n; i++) {
                        System.out.print(i + "  ");
                    }
                    System.out.println(" ");
                    break;
               
                case 2:
                    System.out.println("Exiting.......!");
                   // System.exit(choice);
                default:
                    System.out.println("Enter the valid number ! ");
                    break;
            }
        //}

    }
}

// Qn 6 Armstrong number
class ArmStrong extends NaturalNum {
    public void armStrongNo() {
       // while (true) {
            System.out.println("Enter the number:");// 3 digits armstrong num (153,370,371,407)
            int a = s.nextInt();
            System.out.println("choices 1 or 2 :");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    int copy = a;
                    int r, sum = 0;
                    while (a > 0) {
                        r = a % 10;
                        sum += r * r * r;
                        a /= 10;

                    }
                    if (copy == sum) {
                        System.out.println("The givem num is Armstrong");
                    } else {
                        System.out.println("not Armstrong");
                    }
                    break;
                case 2: // 4digits (1634,8208,9474)
                    System.out.println("4 digits ");
                    int copy1 = a;
                    int r1, sum1 = 0;
                    while (a > 0) {
                        r1 = a % 10;
                        sum1 += r1 * r1 * r1 * r1;
                        a /= 10;

                    }
                    if (copy1 == sum1) {
                        System.out.println("The givem num is Armstrong");
                    } else {
                        System.out.println("not Armstrong");
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    System.out.println("Press Enter to Continue......");
                    s.nextLine();
                    break;
            }
            System.out.println("\nDo you want to try again? Press Y/y for Yes or N/n for No:");
            char c = s.next().charAt(0);
            if (c == 'N' || c == 'n') {
                System.exit(0);
            }
       // }
    }
}
//Qn 7 Leap year or not 
class LeapYear extends ArmStrong{
    public void leapYear(int year){
        
        if(year%4 == 0){
            System.out.println(year + " a leap year");
        }
        else{
            System.out.println(year + " is not a leap  year");
        }
    }
}
//Qn 8 Factorial or product
class Factorial extends LeapYear{
    public void factorialNum(int n){
        int  sum=1;
        for(int i=1; i<=n; i++){
            sum*=i;
        }
        System.out.println("Factorial of "+n+" is " + sum);

    } 
}
// //Qn 9 Magical number 
 class MagicalNum extends Factorial{
     public  void magicalNum(){
        int n, remainder , number, sum = 0;  
        
       
        System.out.print("Enter a number you want to check: "); // 325 
         
        n = s.nextInt();  
        
         
        //outer while loop  
        while (n > 9)               //while(number > 0 || sum > 9)  
        {  
        //inner while loop      
        while (n > 0)  
        {  
             
        remainder = n% 10;              // eq :  3+2+5 =10   next 1+0 = 1 is a magical num 
        sum = sum + remainder;           // 1 is a always magical num 
        
        n = n / 10;     
        }  
        n = sum;  
        sum = 0;  
        }  
        if (n == 1)  
        {  
        System.out.println("The given number is a magic number.");  
        }  
        else  
        {  
        System.out.println("The given number is not a magic number.");  
        }  
    } 

 }
//Qn 10 Reverse the array
class ReverseArray extends MagicalNum{
    public void reverseArray(){
        int arr1[]={23,44,55,1,2,5};
        int start=0, end=arr1.length-1;
        while(start<end)
        {   //swap elements
            int temp=arr1[start];
            arr1[start]=arr1[end] ;
            arr1[end]=temp;
            start++ ;
            end--;
        }
        //printing reversed array
        System.out.println("\nElements in reverse order are : ");
        for (int i = 0; i < arr1.length; i++)  
        {                                    
            System.out.print(arr1[i] + " ");                          
        }              
    }
}    

public class InterviewQn extends ReverseArray{
    public static void main(String[] args) {
        InterviewQn p = new InterviewQn();

        p.getValue();
        System.out.println("----------------1.PALINDROME-------------------");
        System.out.println(p.isPalindrome("ab"));
        System.out.println(p.pali(1001) + " it is palindrome");

        System.out.println("---------------2. FIBONACCI SERIES----------------------");

        p.fibonaci();
        System.out.println("Fiboacci series sum :" + p.fibonaciSum());

        System.out.println("--------------3.PRIME NUM------------------------");

        p.primeNum(87);

        System.out.println("-------------4.ODD OR EVEN----------------------------");
        p.oddOrEven(100);
        p.oddSum(7);
        p.evenSum(20);

        System.out.println("\n-------------5.NATURAL  NUMBERS----------------------------");
        p.naturalNo(10);

        System.out.println("---------------6.ARMSTRONG NUMBER--------------------------");
        p.armStrongNo();

        System.out.println("---------------7.LEAP YEAR OR NOT--------------------------");
        p.leapYear(1999);

        System.out.println("---------------8. FACTORIAL OR NOT--------------------------");
        p.factorialNum(5);

        System.out.println("---------------9. MAGICAL NUMBER--------------------------");
        p.magicalNum();
        
        System.out.println("---------------10.REVERSE THE ARRAY--------------------------");
        p.reverseArray();
        
    }   
}
