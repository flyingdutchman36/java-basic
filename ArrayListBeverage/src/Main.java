import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        demoArrayList1();
//        demoSortString();
//        demoNaturalOrderSort();
//        demoJava8Sort();
//        demoSimpleArrayList();
//        advArrayList();
        findX();
    }

    public static void findX () {
        float y=0;
        float x=0;
        for (int i = 1; i < 5 ; i++) {
            for (int j = i+1; j <= i ; j++) {
                x = 3 * i;
                y = 3 * j;
            }
        }
        for (int k = 1; k <= 10 ; k++) {
            x = ((y*y) + (x*x)) - (2 * i);
            x = 0.5*x*y;
        }
        System.out.println(x);
    }

    public static void demoArray(){
        Drink[] menus = new Drink[10];
        menus[0] = new Drink("orange", "Juice", 40);
        menus[1] = new Drink("orange", "Juice", 40);
    }

    public static void  demoArrayList1(){
        ArrayList<Drink> menus = createDrinkData();
        for (Drink menu: menus) {
            System.out.println(menu.toString());
        }
////        Comparator<Drink> cmpPrice = new Comparator<Drink>() {
////            @Override
////            public int compare(Drink o1, Drink o2) {
////                return o1.getPrice() - o2.getPrice();
////            }
////        };
//        Collections.sort(menus, cmpPrice);
        System.out.println("-------------");
        Collections.sort(menus, new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
//                return o1.getPrice() - o2.getPrice(); // Ascending Sort
                return -(o1.getPrice() - o2.getPrice()); // Descending Sort
            }
        });
        for (Drink menu: menus) {
            System.out.println(menu.toString());
        }
    }

    private static ArrayList<Drink> createDrinkData() {
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("orange", "Juice", 40));
        menus.add(new Drink("Apple", "Juice", 45));
        menus.add(new Drink("lemon", "Juice", 50));
        menus.add(new Drink("coke", "Soda", 25));
        menus.add(new Drink("sprite", "Soda", 70));
        menus.add(new Drink("latte", "Coffee", 80));
        menus.add(new Drink("mocha", "Coffee", 65));
        return menus;
    }

    public static void demoSortString(){
        ArrayList<Drink> menus = createDrinkData();

        for (Drink menu: menus) {
            System.out.println(menu.toString());
        }

        Collections.sort(menus, new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
                if (o1.getCategory().equalsIgnoreCase(o2.getCategory())){
                    return o1.getMenu().compareToIgnoreCase(o2.getMenu());
                } else {
                    return o1.getCategory().compareToIgnoreCase(o2.getCategory());
                }
//                return o1.getMenu().compareToIgnoreCase(o2.getMenu()); // A-Z
            }
        });

        System.out.println("-------- Sorted ---------");
        for (Drink menu: menus) {
            System.out.println(menu.toString());
        }
    }

    public static void demoNaturalOrderSort(){
        ArrayList<Drink> menus = createDrinkData();

        for (Drink menu: menus) {
            System.out.println(menu.toString());
        }

        Collections.sort(menus);

        System.out.println("-------- Sorted ---------");
        for (Drink menu: menus) {
            System.out.println(menu.toString());
        }
    }

    public static void demoJava8Sort(){
        ArrayList<Drink> menus = createDrinkData();

        for (Drink menu: menus) {
            System.out.println(menu.toString());
        }

        /* Method Reference */
//        menus.sort(Comparator.comparing(Drink::getPrice)); // ascending order
//        menus.sort(Comparator.comparing(Drink::getPrice).reversed()); // descending order

        menus.sort(Comparator.comparing(Drink::getPrice).thenComparing(Drink::getMenu));


        System.out.println("-------- Sorted ---------");
        for (Drink menu: menus) {
            System.out.println(menu.toString());
        }
    }

    public static void advArrayList(){
        ArrayList<Drink> menus = createDrinkData();
        for (Drink menu: menus) {
            System.out.println(menu.toString());
        }

        Drink m = new Drink("Latte", "Coffee", 25550);
        System.out.println(menus.contains(m));
    }
    public static void demoSimpleArrayList(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");

        System.out.println(fruits.get(1));
        System.out.println(fruits.indexOf("orange"));
        System.out.println(fruits.contains("kiwi")); // check ว่ามีอยู่ไหม

        fruits.add(1, "coconut"); // ไม่ได้แทนที่ แต่ไป แทรก
        System.out.println(fruits.toString());
        System.out.println(fruits.get(2));
        fruits.add(0, "apple");
        System.out.println(fruits.toString());

        fruits.set(1, "mango"); // แทนที่
        System.out.println(fruits.toString());

    }

}