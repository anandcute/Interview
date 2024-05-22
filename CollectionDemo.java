/*Collection (collection interface)
  1.list(interface) 2.set(interface)                
  * ArrayList       * Haashset
  * LinkedList      * LinkedHashSet and *TreeSet   */
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
class SetDemo{
  //set is not allow duplicates and maintain no any order .
  public void hashSetDemo(){         //HashSet - it is not allow duplicate values.
      Set s =new HashSet();
      System.out.println("HashSet");
       s.add(12);  //add()
       s.add("Anand");
       s.add(223.08);
       s.add(true);
       s.add('D');
       s.add(12);
       System.out.println(s);
       System.out.println("contains is : " + s.contains("Anand"));//contains
       System.out.println("length is : " + s.size());
  }
  public void linkedHashSet(){         //LinkedHashSet - Its allow order (insertion order) and it is not allow duplicate values.
     Set s =new LinkedHashSet();
     System.out.println("LinkedHashSet");
     s.add(12);  //add()
     s.add("Anand");
     s.add(223.08);
     s.add(true);
     s.add('D');
     s.add(12);
     System.out.println(s);
     System.out.println("contains is : " + s.contains("Anand"));//contains
     System.out.println("length is : " + s.size());

     Iterator x = s.iterator();
     while (x.hasNext()) {
        System.out.println(x.next());
      }
    }
    public void treeSet(){ // treeset  working only same data type.
      System.out.println("TreeSet");
      Set s = new TreeSet<>();
      s.add(12);  //add()
      s.add(131);
      s.add(223);//value assign asscending order
      s.add(10);
      s.add(90);
      s.add(120);
      System.out.println(s);
      System.out.println("contains is : " + s.contains(12));//contains
      System.out.println("length is : " + s.size());

      Iterator x = s.iterator();
      while (x.hasNext()) {
        System.out.println(x.next());
      
        } 
      
    }
       
}
class ListDemo extends SetDemo{
  // list is a maintain insertion order
  //Its allow duplicates.
  static void arrayListDemo(){
    System.out.println("ArrayList \n");
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
       System.out.println(list.set(2, "ak")); // set() and add() are same  but set la index value koduthu add pandrom
       System.out.println("list is : " + list);
       //addAll()
       ArrayList  li =new ArrayList<>(Arrays.asList(4,5,3,2,1));
       li.addAll(list);
       System.out.println(li);
       //isEmpty true or false
       System.out.println(li.isEmpty());
       li.clear(); //clear() all the collection
       System.out.println(li.isEmpty());
       System.out.println("----------------END--------------------");
  } 
  static void linkedListDemo(){
    List list =new LinkedList();
    list.add(12);  //add()
    list.add("Anand");
    list.add(223.08);
    list.add(true);
    list.add('D');
    System.out.println("List of Arrays :"+list);
    System.out.println("length is " + list.size());
    list.add(1,100);
    System.out.println("new array "+ list);
    list.remove(1);
    System.out.println("Remove"+list);
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
    System.out.println(list.set(2, "ak")); // set() and add() are same  but set la index value koduthu add pandrom
    System.out.println("list is : " + list);
    //addAll()
    List  li =new LinkedList<>(Arrays.asList(4,5,3,2,1));
    li.addAll(list);
    System.out.println(li);
    //isEmpty true or false
    System.out.println(li.isEmpty());
    li.clear(); //clear() all the collection
    System.out.println(li.isEmpty());
    System.out.println("----------------END--------------------");
  }
}
class MapDemo extends ListDemo {
  //key-value = Entry
  //key - It is won't allow duplicate value(set type)
  //value - It is allow duplicates(list type)
  //entry is set  type.

  public void hashMap(){
    Map m =new HashMap<>();
    m.put("ak",21);
    m.put("Anand",22);
    m.put("dee",20);
    m.put("Deepak",21);
    m.put(06,"kumar");
    System.out.println("Hashmap value:"+ m);

    //keyset
    Set s = m.keySet();
    System.out.println("keyvalue is : " + s);

    //value
    Collection c =m.values();
    System.out.println("values : " + c);
    System.out.println("size : " + m.size());

    //entry set 
    Set s1 = m.entrySet();
    System.out.println("entry set : " + s1);
    //contains
    System.out.println(m.containsKey("Anand"));
    System.out.println(m.containsValue(22));
    
    System.out.println("----------------END--------------------");
  }
  public void treeMap(){
    Map m =new TreeMap();
    m.put(88,21);
    m.put(8,22);
    m.put(9,20);
    m.put(77,21);
    m.put(06,77);
    System.out.println("Treemap value:"+ m);

    //keyset
    Set s = m.keySet();
    System.out.println("keyvalue is : " + s);

    //value
    Collection c =m.values();
    System.out.println("values : " + c);
    System.out.println("size : " + m.size());

    //entry set 
    Set s1 = m.entrySet();
    System.out.println("entry set : " + s1);
    System.out.println("----------------END--------------------");
  }
  public void linkedHashMap(){
    Map m =new LinkedHashMap();
    m.put("ak",21); //linkedhashmap only same order
    m.put("Anand",22);
    m.put("dee",20);
    m.put("Deepak",21);
    m.put(06,"kumar");
    System.out.println("liinkedHashmap value:"+ m);

    //keyset
    Set s = m.keySet();
    System.out.println("keyvalue is : " + s);

    //value
    Collection c =m.values();
    System.out.println("values : " + c);
    System.out.println("size : " + m.size());

    //entry set 
    Set s1 = m.entrySet();
    System.out.println("entry set : " + s1);
    System.out.println("----------------END--------------------");
  }

  
}




public class CollectionDemo {
    public static void main(String[] args) {
      
      MapDemo sd = new MapDemo();
      sd.arrayListDemo();
      sd.linkedListDemo();
      sd.hashSetDemo();
      sd.linkedHashSet();
      sd.treeSet();
      sd.hashMap();
      sd.linkedHashMap();
      sd.treeMap();
       
    }
}

    
