import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
       demo();
    }

    public static void demo() {
        Queue<String> q = new LinkedList<String>();
        q.offer("mango1");
        q.offer("mango2");
        q.offer("mango3");
        q.offer("mango4");
        q.offer("mango5");

        System.out.println(q.peek()); // peek get data[0]

        System.out.println(q);
        q.poll(); // pool remove first data
        System.out.println(q);
        q.poll(); // pool remove first data
        System.out.println(q);


    }

}