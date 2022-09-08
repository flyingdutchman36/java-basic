import java.time.LocalDate;

/**
 * Created by "SumarK" On 18/8/2565 | 14:28
 * Copy&Paste Engineering. Good luck have fun.
 */
public class City {
    private String name;
    private LocalDate date;

    public City(String name, LocalDate date) {
        this.name = name;
        this.date = date;
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

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (!name.equals(city.name)) return false;
        return date.equals(city.date);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }
}
