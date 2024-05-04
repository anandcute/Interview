//Q1. Multiple of the tables (ex 2 0r 10) are sum of the 1 to 10.
//example I/P : n=2 (2x1=2 + 2x2=4 + .........+ 2x10=20)
//outputs: 110
//ex2  i/p: n=10   (10x1=10 + 10x2=20 + .........+ 10x10=100)
//o/p: 550



public class NumMultipleSum {
    public static void main(String[] args) {
       int n=10;
       int sum=0;

       for(int i=1; i<=10; i++){
            sum+=i*n;
       }
       System.out.println(sum);
    }
}
