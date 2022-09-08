import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by "SumarK" On 19/8/2565 | 13:46
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Passenger implements Comparable<Passenger>{
    private String name;
    private String ticketType; // First, Business, Economy

    private static Map<String, Integer> ticketOrder = new HashMap<String, Integer>();

    static {
        ticketOrder.put("FIRST", 1);
        ticketOrder.put("BUSINESS", 2);
        ticketOrder.put("ECONOMY", 3);
    }

    public Passenger(String name, String ticketType) {
        this.name = name;
        this.ticketType = ticketType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", ticketType='" + ticketType + '\'' +
                '}';
    }

    @Override
    public int compareTo(Passenger o) {

        return ticketOrder.get(this.getTicketType().toUpperCase())
               .compareTo(ticketOrder.get(o.getTicketType().toUpperCase()));
    }
}
