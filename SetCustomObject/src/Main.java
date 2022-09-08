import java.util.*;

public class Main {

    public static void main(String[] args) {
        //demo1();
//        demoCustomObject();
        demoTreeSet();
        demoTreeSet2();
    }

    public static void demoTreeSet(){
         Set<String> set = new TreeSet<>();
         set.add("mango");
         set.add("coconut");
         set.add("apple");
         set.add("kiwi");
        System.out.println(set);
    }

    public static void demoTreeSet2(){
       // Set<Drink> set = new TreeSet<>();

//        Set<Drink> set = new TreeSet<>(new Comparator<Drink>() {
//            @Override
//            public int compare(Drink o1, Drink o2) {
//                return o1.getMenu().compareToIgnoreCase(o2.getMenu());
//            }
//        });

//        Comparator<Drink> cmp = new Comparator<Drink>() {
//            @Override
//            public int compare(Drink o1, Drink o2) {
//                return o1.getMenu().compareToIgnoreCase(o2.getMenu());
//            }
//        };

        Set<Drink> set = new TreeSet<>(Drink.byPriceName());

        set.add(new Drink("mango", 40f));
        set.add(new Drink("coconut", 50f));
        set.add(new Drink("apple", 60f));
        set.add(new Drink("kiwi", 70f));
        set.add(new Drink("test", 50f));
        set.add(new Drink("best", 50f));
        for (Drink drink : set) {
            System.out.printf("%s%n",drink);
        }
    }

    public static void demo1(){
        Set<String> set = new LinkedHashSet<>();
        set.add("mango");
        set.add("orange");
        set.add("apple");
        set.add("mango");
        System.out.println("before -> "+set);

        String s = "apple";
        if(set.contains(s)){
            System.out.printf("%s is in the set. %n", s);
            set.remove(s);
        }else {
            System.out.printf("%s is not in the set %n", s);
        }

        System.out.println("after ->"+set);
    }

    public static void demoCustomObject(){
        Set<Drink> set = new LinkedHashSet<>();
        set.add(new Drink("mango", 40f));
        set.add(new Drink("orange", 45f));
        set.add(new Drink("apple", 50f));
        set.add(new Drink("Mango", 40f));

        for (Drink drink : set) {
            System.out.printf("%s -> %s%n", drink.getMenu(), drink.getMenu().hashCode());
        }

        Drink d = new Drink("apple", 50f);
        if(set.contains(d)){
            System.out.println("\n"+d+" is in the set.\n");
        }else {
            System.out.println("\n"+d+" is not in the set.\n");
        }

        set.remove(d);
        for (Drink drink : set) {
            System.out.printf("%s%n", drink);
        }

    }

}