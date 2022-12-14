import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Map<City, Temperature> m = new LinkedHashMap<>();

    public static void main(String[] args) {
        createData();
//        displayData();
//        findData(new City("bkk", LocalDate.of(2014, Month.JUNE, 1)));
//        System.out.println();
//        findData(new City("bkk", LocalDate.of(2014, Month.JUNE, 15)));
//        System.out.println();
        //findByCityName("Tak");
        System.out.println("find by city name using lambda");
        findByCityNameUsingLambda("Tak");
        System.out.println("find by date using lambda");
        findByDateUsingLambda(LocalDate.of(2014, Month.JUNE,1));
    }

    public static void  createData(){
        m.put(new City("bkk", LocalDate.of(2014, Month.JUNE,1)), new Temperature(33f, 30f));
        m.put(new City("bkk", LocalDate.of(2014, Month.JUNE,2)), new Temperature(32f, 29.5f));
        m.put(new City("bkk", LocalDate.of(2014, Month.JUNE,3)), new Temperature(31f, 30f));
        m.put(new City("bkk", LocalDate.of(2014, Month.JUNE,1)), new Temperature(33f, 27f));

        m.put(new City("tak", LocalDate.of(2014, Month.JUNE,1)), new Temperature(29f, 25f));
        m.put(new City("tak", LocalDate.of(2014, Month.JUNE,2)), new Temperature(28f, 26f));
        m.put(new City("tak", LocalDate.of(2014, Month.JUNE,3)), new Temperature(27f, 25f));
        m.put(new City("tak", LocalDate.of(2014, Month.JUNE,1)), new Temperature(26f, 24f));
    }

    public static void findByCityName(String cityName){
        Set<City> cities = m.keySet();
//        for (City city : cities){
//            System.out.println(city);
//        }
        List<City> list = new ArrayList<>();
        for (City city: cities) {
            if(city.getName().equalsIgnoreCase(cityName)){
                list.add(city);
            }
        }

        for (City city: list){
            System.out.printf("%s - %s\n", city, m.get(city));
        }
    }

    public static void displayData(){
        for (Map.Entry<City, Temperature> item : m.entrySet()){
            City key = item.getKey();
            Temperature value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
        }
    }

    public static void  findData(City city){
        if(m.containsKey(city)){
            System.out.printf("found: %s %s", city, m.get(city));
        }else {
            System.out.printf("unable to find %s", city);
        }
    }


  // Recommend this function
    public static void findByCityNameUsingLambda(String cityName){
        Set<City> cities = m.keySet();

        List<City> list = cities.stream()
                .filter(p->p.getName().equalsIgnoreCase(cityName))
                .collect(Collectors.<City>toList());

        for (City city: list){
            System.out.printf("%s - %s\n", city, m.get(city));
        }
    }

    public static void findByDateUsingLambda(LocalDate date){
        Set<City> cities = m.keySet();

        List<City> list = cities.stream()
                .filter(p->p.getDate().equals(date))
                .collect(Collectors.<City>toList());

        for (City city: list){
            System.out.printf("%s - %s\n", city, m.get(city));
        }
    }



}