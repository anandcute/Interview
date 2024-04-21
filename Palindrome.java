public class Palindrome {

    public  static boolean isPalindrome(String str){
        String rev="";
        boolean flag=false;
        for(int i=str.length()-1; i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            flag=true;

        }
        return flag;
    }
    public static int pali(int n){
        int r,reve=0;
        while(n>0){
            r=n%10;
            n/=10;
            reve=reve*10+r;
        }
        return reve;
    }
    public static void main(String[] args) {
    System.out.println(isPalindrome("ab"));
    System.out.println(pali(1001)+  "  it is palindrome");   
    }
}
