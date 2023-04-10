import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistDemo{
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.set(3, 35));
        System.out.println("Element deleted: "+list.remove(0));
        System.out.println("Updated list is: "+list);

        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("=====List Iterator====");
        ListIterator<Integer> listitr=list.listIterator(list.size());
        while(listitr.hasPrevious()){
            System.out.println(listitr.previous());
        }
    }
}
