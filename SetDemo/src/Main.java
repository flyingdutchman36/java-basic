import java.util.*;

public class Main {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        demo3();
    }

    public static void demo1(){
        Set<String> setA = new HashSet<String>();
        setA.add("mango");
        setA.add("banana");
        setA.add("blueberry");
        setA.add("banana");
        System.out.println(setA);
    }

    public static void demo2(){
        Set<String> setA = new HashSet<String>(Arrays.asList("mango", "banana", "banana"));
        System.out.println(setA);
    }

    public static void demo3(){
        List<String> fruits = new ArrayList<String>(Arrays.asList("mango", "banana", "banana", "orange"));

        Set<String> setA = new HashSet<String>(fruits);
        Set<String> setB = new LinkedHashSet<String>(fruits);
        Set<String> setC = new TreeSet<String>(fruits);

        System.out.println("HashSet        :"+setA);
        System.out.println("LinkedHashSet  :"+setB);
        System.out.println("TreeSet        :"+setC);


    }


}