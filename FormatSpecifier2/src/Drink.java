/**
 * Created by "SumarK" On 2/9/2565 | 14:46
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Drink {
    private String menu, category;
    private int price;

    public Drink(String menu, String category, int price) {
        this.menu = menu;
        this.category = category;
        this.price = price;
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
}
