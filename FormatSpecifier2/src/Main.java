import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Drink> menus = new ArrayList<>();

    public static void main(String[] args) {
        createData();
        displayData();
    }

    private static void createData() {
        menus.add(new Drink("orange","Juice",40));
        menus.add(new Drink("apple","Juice",30));
        menus.add(new Drink("coconut","Juice",35));
        menus.add(new Drink("coke","Soda",70));
        menus.add(new Drink("sprite","Soda",20));
    }

    private static void displayData() {
        String s = "";
        int cnt = 0;
        for (Drink menu : menus){
            //System.out.printf("%s %s %d %n", menu.getMenu(), menu.getCategory(), menu.getPrice());
            s += String.format("%03d: %-8s %-7s %2d %n", ++cnt, menu.getMenu(), menu.getCategory(), menu.getPrice());
            //System.out.printf("%03d: %-8s %-7s %2d %n", ++cnt, menu.getMenu(), menu.getCategory(), menu.getPrice());

        }System.out.println(s);
    }
}