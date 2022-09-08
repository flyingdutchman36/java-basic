import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        demo1();
    }

    public static void demo1(){
        Team teamA = new Team();
        teamA.setName("Cavaliers");
        teamA.setCity("Cleveland");
        List<Player> players = new ArrayList<Player>();
        players.add(new Player("LeBron", "James", "forward", LocalDate.of(1994, Month.JUNE, 15)));
        players.add(new Player("Mike", "James", "forward", LocalDate.of(1994, Month.JUNE, 15)));
        players.add(new Player("Jack", "James", "forward", LocalDate.of(1994, Month.JUNE, 15)));
        players.add(new Player("Mangkorn", "James", "forward", LocalDate.of(1994, Month.JUNE, 15)));
        players.add(new Player("Sorju", "James", "forward", LocalDate.of(1994, Month.JUNE, 15)));
        teamA.setPlayers(players);
        System.out.println(teamA);

        Team teamB = new Team();
        teamB.setName("Hawks");
        teamB.setCity("Atlanta");
        List<Player> playersB = new ArrayList<Player>();
        playersB.add(new Player("LeBron", "James", "forward", LocalDate.of(1994, Month.JUNE, 15)));
        playersB.add(new Player("Mike", "James", "forward", LocalDate.of(1994, Month.JUNE, 15)));
        playersB.add(new Player("Jack", "James", "forward", LocalDate.of(1994, Month.JUNE, 15)));
        playersB.add(new Player("Mangkorn", "James", "forward", LocalDate.of(1994, Month.JUNE, 15)));
        playersB.add(new Player("Sorju", "James", "forward", LocalDate.of(1994, Month.JUNE, 15)));
        teamB.setPlayers(playersB);
        System.out.println(teamB);

        Match m = new Match(teamA, teamB, "Cleveland", LocalDateTime.of(2014, Month.JUNE,15, 18,0,0));
        System.out.println(m);

    }

}