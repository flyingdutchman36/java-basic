import java.util.Comparator;
import java.util.Objects;

/**
 * Created by "SumarK" On 19/6/2565 | 2:56
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Drink implements Comparable<Drink>{
    private String menu;
    private float price;

    public static Comparator<Drink> byNameDescending(){
        Comparator<Drink> cmp = new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
                return -o1.getMenu().compareToIgnoreCase(o2.getMenu());
            }
        };
        return cmp;
    }

    public static Comparator<Drink> byPriceName(){
        Comparator<Drink> cmp = new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
                if (Float.compare(o1.getPrice(), o2.getPrice()) == 0){
                    return o1.getMenu().compareToIgnoreCase(o2.getMenu());
                } else {
                    return Float.compare(o1.getPrice(), o2.getPrice());
                }
            }
        };
        return cmp;
    }

    @Override
    public int compareTo(Drink o) {
        return Float.compare(this.getPrice(), o.getPrice()); // sort by price
       // return this.getMenu().compareToIgnoreCase(o.getMenu()); // sort by ABC
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Float.compare(drink.price, price) == 0 && menu.toUpperCase().equals(drink.menu.toUpperCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(menu.toUpperCase(), price);
    }

    public Drink(String menu, float price) {
        this.menu = menu;
        this.price = price;
    }

    public Drink() {
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "menu='" + menu + '\'' +
                ", price=" + price +
                '}';
    }
}
