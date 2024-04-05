public class RecursionDemo {
    int a;
    static int fun(int a,int b){
        if (b==0) {
            return 0;
        }
        if (b%2==0){
            return fun(a+a,b/2);
        }
        return fun(a+a, b/2)+a;
            

    }
    public static void main(String[] args) {
        int b=10, a=7;
        //RecursionDemo r =new RecursionDemo();
        System.out.println("solution"+ fun(a, b) );
        
        
    }    
}
