import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
 
//Comparator interface (using sorting fn)
//descending order

class ExImpl implements Comparator<Integer>{
    public  int compare(Integer o1 , Integer o2){
        return o2.compareTo(o1);
    }
}
class Ex1Impl implements Comparator<String>{
    public  int compare(String o1 , String o2){
        return o2.compareTo(o1);
    }
} 


public class CollectionSortDemo {
    public static void main(String[] args) {
        List <Integer> number = new ArrayList<>(Arrays.asList(43,44,2,90,87,55,32,10,38));
        List<String> words=new ArrayList<>(Arrays.asList("Anand","xx","Deepak","Manoj","Kumar","Kalai"));
        //Collections.sort(number,new ExImpl());
        System.out.println(number);
        //Collections.sort(words,new Ex1Impl());
        System.out.println(words);
        // for(Integer i : number)
        //  System.out.println(i);
        // for(String i : words)
        //  System.out.println(i);
        //(or) Iteration interface
        // 1. hashNext()  2.next() 3.remove()
        Iterator<Integer> i =number.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        } 
        System.out.println("*******************************************\n");
        Iterator<String> i1 =words.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
            
        } 
            
    }

}
