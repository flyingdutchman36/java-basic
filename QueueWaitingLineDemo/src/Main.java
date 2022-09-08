import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        Queue<WaitingLine> queues = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queues.offer(new WaitingLine());
            try {
                Thread.sleep((i+1)*50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        displayQueueInfo(queues);
        System.out.println("-----------------------");
        queues.poll();
        displayQueueInfo(queues);
        queues.removeIf(p->p.getQueueId() - queues.peek().getQueueId() > 5);
        System.out.println("-----------------------");
        displayQueueInfo(queues);
    }

    public static void displayQueueInfo(Queue<WaitingLine> queues) {
        for (WaitingLine queue : queues){
            System.out.printf("%s\n",queue);
            System.out.printf("there are "+ (queue.getQueueId() - queues.peek().getQueueId() +
                              " queues ahead of you %n"));
        }
    }

}