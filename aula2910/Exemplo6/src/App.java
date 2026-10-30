import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(57);
        pq.offer(1);
        pq.offer(127);
        pq.offer(32);
        pq.offer(47);
        pq.offer(17);
        System.out.println(pq);
        System.out.println("Menor : "  + pq.peek());
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}
