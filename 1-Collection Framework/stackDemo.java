import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

import javax.lang.model.element.Element;

public class stackDemo{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(45);

        System.out.println("Elements inside stack are: "+st);
        System.out.println("Poped element is: "+st.pop());
        System.out.println("Updated list is: "+st);
        System.out.println("Element at the top of the stack is: "+st.peek());

        System.out.println("Element 10 is at index: "+st.search(10));
    
    System.out.println("Iterator");
    Iterator <Integer>itr=st.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }

    System.out.println();
    System.out.println("====List Iterator=====");
    ListIterator <Integer>ltr=st.listIterator(st.size());
    while(ltr.hasPrevious()){
        System.out.println(ltr.previous());
    }
    }


}
