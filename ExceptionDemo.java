public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start");
        int c=0;
        try{
            int a=5;
            int b=0;
            c=a/b;

        }
        catch(ArithmeticException e){
            System.out.println("Arthmetric " + e);
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
    }
}
