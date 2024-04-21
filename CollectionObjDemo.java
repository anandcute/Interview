import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Sample{
    String name;
    Integer rollno;
    Sample( String n , int r ){
        this.name=n;
        this.rollno=r;

    }
    public String toString(){
        return "Name : " + name + " Rollno : " + rollno ;
    }
}
class ObjDemo implements Comparator<Sample>
{
    public int compare(Sample o1 , Sample o2){
        return o2.rollno.compareTo(o1.rollno);
    }
}

public class CollectionObjDemo {
    public static void main(String[] args) {
        List <Sample> l = new ArrayList<>(Arrays.asList(
            new Sample("Anand",22),
            new Sample("cc",23),
            new Sample("manoj",24),
            new Sample("kalai",27),
            new Sample("suba",55)));
        System.out.println(l);
        Collections.sort(l,new ObjDemo());
        System.out.println(l);
    }
}    