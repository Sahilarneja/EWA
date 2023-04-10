import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
public class queueDemo{
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<Integer>();
        //linkedlist is used here because queue is an interface
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(35);
        que.add(45);

        System.out.println(que);
        System.out.println("Element removed: "+que.remove());
        System.out.println("Updated list is: "+que);
        System.out.println("Element at the front is: "+que.peek());

        Iterator <Integer>itr=que.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}