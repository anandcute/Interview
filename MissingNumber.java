//Missing number
//268 for leet code
//Given an array nums containing n distinct numbers in the range [0,n],return in the range that is missing form the array.
public class MissingNumber {

    static int missingValue (int []num){
        int n = num.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=num[i];//sum=sum+num[i]
        }
        //System.out.println("the value is :" + (n*(n+1)/2 - sum));
        return n*(n+1)/2 - sum;
    }
    public static void main(String[] args) {
            int [] num={1,2,3,4,5,6,7,9,0};
            MissingNumber m = new MissingNumber();
            int x=m.missingValue(num);
            System.out.println("value :" + x);  
           }
    
}
