import java.time.LocalDate;

/**
 * Created by "SumarK" On 20/6/2565 | 1:12
 * Copy&Paste Engineering. Good luck have fun.
 */
public class City {
    private String name;
    private LocalDate date;

    public City(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
