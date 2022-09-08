import java.util.Arrays;

public class Ep12_ArraySort {

    public static void demoSortNumber(){
        int[] n = {28, 32, 55, 9, 40};
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
//        for (int i = 0; i < n.length; i++) {
//            System.out.print(n[i]+" ");
//        }
    }

    public static void demoSortString(){
        String[] coffees = {"Mocha", "Latte", "Espresso", "cappuccino"};
        System.out.println("before: "+Arrays.toString(coffees));
        //Arrays.sort(coffees);
        //System.out.println("after: "+Arrays.toString(coffees));
        Arrays.sort(coffees, 0, coffees.length, String.CASE_INSENSITIVE_ORDER); // เรียงแบบไม่สนใจ พิมพ์ใหญ่ พิมพิ์เล็ก
        System.out.println("after: "+Arrays.toString(coffees));

    }

    public static void main(String[] args) {
       // demoSortNumber();
        demoSortString();

    }

}
