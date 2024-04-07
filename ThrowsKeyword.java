import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {
    public static void main(String[] args)throws FileNotFoundException{
        System.out.println("start");
        FileReader fr =new FileReader("abc.txt");
        System.out.println("end");
    }
}
