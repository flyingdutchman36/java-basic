import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static List<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        createData();
        displayData();
        sortByAge();
        sortIgnoreYear();
        sortIgnoreYearFromToday();
    }

    public static void createData() {
        persons.add(new Person("Peter", LocalDate.of(1995, Month.JULY, 14)));
        persons.add(new Person("Parker", LocalDate.of(1995, Month.JULY, 15)));
        persons.add(new Person("Mangorn", LocalDate.of(1995, Month.JULY, 16)));
        persons.add(new Person("Tong", LocalDate.of(1995, Month.JULY, 17)));
        persons.add(new Person("Mangorn", LocalDate.of(1995, Month.JULY, 20)));
        persons.add(new Person("Dang", LocalDate.of(1995, Month.JULY, 19)));
        persons.add(new Person("Sorju", LocalDate.of(1995, Month.JULY, 18)));
        persons.add(new Person("Aka", LocalDate.of(1995, Month.JULY, 13)));
    }

    public static void displayData() {
        for (Person person: persons) {
            System.out.println(person);
        }
    }

    public static void sortByAge(){
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return -o1.getDob().compareTo(o2.getDob());
            }
        });
        System.out.println("Sort by age");
        displayData();
    }

    public static void sortIgnoreYear() {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getDobIgnoreYear().compareTo(o2.getDobIgnoreYear());
            }
        });
        System.out.println("Sort by age (Ignore year)");
        displayData();
    }

    public static void sortIgnoreYearFromToday() {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getDobIgnoreYearFromToday().compareTo(o2.getDobIgnoreYearFromToday());
            }
        });
        System.out.println("Sort by age (Ignore year from today)");
        displayData();
    }




}