import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue{
    public static void main(String[] args) {
        Queue<Integer> que=new PriorityQueue();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);

        System.out.println("Elements in a Priority Queue are: "+que);
        System.out.println("Delete an Element: "+que.remove());
        System.out.println("Updated list is: "+que);

        System.out.println("Element at peek is: "+que.peek());

        System.out.println("======Iterator=====");
        Iterator<Integer> itr=que.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}