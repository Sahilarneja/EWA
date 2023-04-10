import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayDemo{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Microsoft");
        list.add("Apple");
        list.add("Samsung");
        list.add("Delloite");

        for(String str:list){
            System.out.println(str);
        }

        System.out.println();
        list.add(0, "Google");
        System.out.println("Updated list is: "+list);
        list.remove(1);
        System.out.println();
        System.out.println("Updated list of companies is: "+list);

        System.out.println("company on index 3 is: "+list.get(3));

        list.set(0, "we work");
        System.out.println(list);


        System.out.println();
        
        System.out.println("======Iterator=====");
        Iterator <String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");

        }

        System.out.println();
        System.out.println("=====List Iterator====");
        ListIterator <String>ltr=list.listIterator(list.size());
        while(ltr.hasPrevious()){
            System.out.println(ltr.previous()+" ");
        }
        }
    }
