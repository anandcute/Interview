/*Collection (collection interface)
  1.list(interface) 2.set(interface)                
  * ArrayList       * Haashset
  * LinkedList      * LinkedHashSet and *TreeSet   */
import java.util.ArrayList;
import java.util.Arrays;
public class CollectionDemo {
    public static void main(String[] args) {
        //ArrayList
       // ArrayList<Integer> list =new ArrayList<Integer>();
       ArrayList list =new ArrayList();
       list.add(12);  //add()
       list.add("Anand");
       list.add(223.08);
       list.add(true);
       list.add('D');
       System.out.println(list);
       System.out.println("length is " + list.size());
       list.add(1,100);
       System.out.println("new array "+ list);
       list.remove(1);
       System.out.println(list);
       list.add(1,100);
       list.add(100);
       System.out.println(list);
       int pos1 =list.indexOf(100); 
       int pos =list.lastIndexOf(100);  //postion value remove
       list.remove(pos);
       list.remove(pos1); //remove()
       System.out.println(list);
       System.out.println(list.contains("Anand")); //contins() are only boolean type (the given value present in array means its true or its false )
       System.out.println(list.contains("Kumar"));
       System.out.println(list.get(4)); // get() la ena index  value tharamo atha value print agum
       System.out.println(list.set(2, list)); // set() and add() are same  but set la index value koduthu add pandrom
       //addAll()
       ArrayList  li =new ArrayList<>(Arrays.asList(4,5,3,2,1));
       li.addAll(list);
       System.out.println(li);
       //isEmpty true or false
       System.out.println(li.isEmpty());
       li.clear(); //clear() all the collection
       System.out.println(li.isEmpty());
    }
}

    
