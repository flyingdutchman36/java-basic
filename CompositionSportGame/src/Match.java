import java.time.LocalDateTime;

/**
 * Created by "SumarK" On 16/6/2565 | 23:35
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Match {
    private Team teamA, teamB;
    private String city;
    private LocalDateTime schedule;

    public Match(Team teamA, Team teamB, String city, LocalDateTime schedule) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.city = city;
        this.schedule = schedule;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalDateTime schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Match{" +
                "teamA=" + teamA +
                ", teamB=" + teamB +
                ", city='" + city + '\'' +
                ", schedule=" + schedule +
                '}';
    }
}
