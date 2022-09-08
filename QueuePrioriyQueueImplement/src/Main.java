import java.util.PriorityQueue;

public class Main {

    static PriorityQueue<Passenger> passengers = new PriorityQueue<Passenger>();

    public static void main(String[] args) {
       createData();
       pollData();
    }

    private static void createData() {
        passengers.offer(new Passenger("Peter", "ECONOMY"));
        passengers.offer(new Passenger("Linda", "BUSINESS"));
        passengers.offer(new Passenger("Parker", "FIRST"));
        passengers.offer(new Passenger("Samu", "ECONOMY"));
        passengers.offer(new Passenger("Eto", "BUSINESS"));
        passengers.offer(new Passenger("BoxBox", "ECONOMY"));
        passengers.offer(new Passenger("Nami", "FIRST"));
    }

    private static void pollData() {
        int q = 0;
        while (!passengers.isEmpty()){
            System.out.printf("%d -> %s %n",++q, passengers.poll());
        }
    }



}