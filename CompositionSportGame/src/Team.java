import java.util.ArrayList;
import java.util.List;

/**
 * Created by "SumarK" On 16/6/2565 | 23:24
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Team {
    private String name, city;
    private List<Player> players = new ArrayList<Player>();

    public Team(String name, String city, List<Player> players) {
        this.name = name;
        this.city = city;
        this.players = players;
    }

    public Team() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", players=" + players +
                '}';
    }
}
