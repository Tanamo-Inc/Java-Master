package intermediate;

import static core.MyCore.toastln;
import java.util.PriorityQueue;
// queue is a data structure that follows "FIFO"  that is first in first out.//

public class Queue {

    public static void main(String[] args) {

        PriorityQueue<String> que = new PriorityQueue<>();
        //displayig the  list below.
        que.offer("First");
        que.offer("Second");
        que.offer("Third");

        System.out.printf("%s", que);
        toastln();
        //return number with the highest priority using peek() method.
        System.out.printf("%s", que.peek());
        toastln();
        //removing the elements with the highest priority using poll method.
        que.poll();
        System.out.printf("%s", que);
        toastln();
    }

}
