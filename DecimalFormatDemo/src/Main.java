import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        demo();
        demoPercent();
        
    }

    private static void demo() {
        double number = 12379999900.3467;
        DecimalFormat df = new DecimalFormat("#,##0.00 Baht ;(#,##0.00 Baht)");
        System.out.println(df.format(number));
        System.out.println(df.format(-number));
    }

    private static void demoPercent() {
        double number = .34637;
        DecimalFormat df = new DecimalFormat("0.00##%");
        System.out.println(df.format(number));
        System.out.println(df.format(-number));
    }


}