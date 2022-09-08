import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by "SumarK" On 19/8/2565 | 14:19
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Main2 {
    //static PriorityQueue<Passenger2> passengers = new PriorityQueue<Passenger2>();
    static PriorityQueue<Passenger2> passengers = new PriorityQueue<Passenger2>(
            Comparator.comparing(Passenger2::getTicketType).thenComparing(Passenger2::getName)
    );

    public static void main(String[] args) {
        createData();
        pollData();
    }

    private static void createData() {
        passengers.offer(new Passenger2("Peter", TicketType.ECONOMY));
        passengers.offer(new Passenger2("Linda", TicketType.BUSINESS));
        passengers.offer(new Passenger2("Parker",TicketType.FIRST));
        passengers.offer(new Passenger2("Samu", TicketType.ECONOMY));
        passengers.offer(new Passenger2("Eto", TicketType.BUSINESS));
        passengers.offer(new Passenger2("BoxBox",TicketType.ECONOMY));
        passengers.offer(new Passenger2("Nami", TicketType.FIRST));
    }

    private static void pollData() {
        int q = 0;
        while (!passengers.isEmpty()){
            System.out.printf("%d -> %s %n",++q, passengers.poll());
        }
    }

}
