import java.util.Iterator;
import java.util.Map;

public class hashMap{
    public static void main(String[] args) {
    Map<Integer,String> map1=new hashMap();
    map1.put(1, "Krati");
    map1.put(2, "Sahil");
    map1.put(3, "Hardik");
    map1.put(4, "Sanyam");

    System.out.println("Values in hashmap are: "+map1);
    System.out.println("Values inside keys are: "+map1.keySet());
    System.out.println("Values insode entryset are: "+map1.entrySet());
    System.out.println("Values inside hashmap are: "+map1.values());


    Iterator<Integer>itr=map1.keySet().iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    }
}