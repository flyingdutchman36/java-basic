import java.util.Objects;

/**
 * Created by "SumarK" On 2/6/2565 | 16:17
 * © Copy&Paste Engineering. Good luck have fun.
 */
public class Drink implements Comparable<Drink> {
    private String menu, category;
    private int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
//        return price == drink.price && menu.equalsIgnoreCase(drink.menu) && category.equalsIgnoreCase(drink.category);
        return menu.equalsIgnoreCase(drink.menu) && category.equalsIgnoreCase(drink.category);

    }

    @Override
    public int hashCode() {
        return Objects.hash(menu, category, price);
    }

    public Drink(String menu, String category, int price) {
        this.menu = menu;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "menu='" + menu + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Drink o) {
        if(this.getCategory().equalsIgnoreCase(o.getCategory())){
            return this.getMenu().compareToIgnoreCase(o.getMenu());
        }else {
            return this.getCategory().compareToIgnoreCase(o.category);
        }
    }

}
