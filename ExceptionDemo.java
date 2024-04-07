import java.util.*;

public class ExceptionDemo {
        
        void  arrayDemo() {
            
            
            int[] arr=new int [5];
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number:  ");
                //int b[]={123,890,0,84,60};
            try{
            for(int i=0; i<6; i++){
        
                arr [i]=scanner.nextInt();
            }
            System.out.println("return the array");
            for (int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
           }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
           }
           catch(Exception e){
            System.out.println(e);
           }
           finally{
            System.out.println("this is finally");
           }
           System.out.println("end");
           System.out.println("************************\n")
        }
        void arithMetic(){
            System.out.println("Start");
            int c=0;
            try{
            int a=5;
            int b=0;
            //int c=0;
            if (b==0) {
                throw new ArithmeticException("The value of dr.should not be zero");
                
            }
            c=a/b;

            }
            catch(ArithmeticException e){
                System.out.println("Arithmetric " + e);
            }
            catch(Exception e){
               System.out.println("catch  "+ e);
            }
         //finally using for closing the file 
           finally{
              System.out.println("This is finally");
            }
            System.out.println(" value of c " + c);
            System.out.println("end");
            System.out.println("************************\n");
        }
        void nullPointer(){
            System.out.println("start");
            String str = null;
            try{
                if(str == null){
                    throw new NullPointerException("string str shoul not be empty"); //throw keyword will be use client clear meaning for the exception error.  
                }
                System.out.println(str.length());
            }
            catch(NullPointerException e){
                System.out.println("null pointer" + e);
            }

            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("end");
            System.out.println("********************\n");
        }
        
    
        
    
    public static void main(String[] args) {
        
        ExceptionDemo ex=new ExceptionDemo();
        ex.arrayDemo();
        ex.arithMetic();
        ex.nullPointer();
        

        
    }
}
