import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        unionDemo();
        intersectionDemo();
        difference();
    }

    public static void unionDemo(){
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> setB = new HashSet<>(Arrays.asList("B", "C", "D", "E", "F"));

        System.out.println("---------- union --------");
        System.out.println("set A: "+setA+"\nset B: "+setB);
        setA.addAll(setB);
        System.out.println("set C = AUB A(union)B: "+setA);

        Set<String> setC = new HashSet<>();
        setC.addAll(setA);
        setC.addAll(setB);
       // System.out.println("set C: "+setC);

    }

    public static void intersectionDemo(){
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> setB = new HashSet<>(Arrays.asList("B", "C", "D", "E", "F"));
        System.out.println("---------- intersection --------");
        System.out.println("set A: "+setA+"\nset B: "+setB);


        Set<String> setC = new HashSet<>(setA);
        setC.retainAll(setB);
        System.out.println("set C = A(intersection)B: "+setC);
    }

    public static void difference(){
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> setB = new HashSet<>(Arrays.asList("B", "C", "D", "E", "F"));
        System.out.println("---------- difference --------");
        System.out.println("set A: "+setA+"\nset B: "+setB);

        Set<String> setC = new HashSet<>(setA);
        setC.removeAll(setB);
        System.out.println("set C = A(difference)B: "+setC);
    }

}