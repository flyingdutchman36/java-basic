public class Main {
    public static void main(String[] args) {
        String s = "sunflower";
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,7));

        System.out.println(SimpleAdd.add(4.2, 5.3));
        System.out.println(SimpleAdd.add(3.2f, 3.2f));
        System.out.println(SimpleAdd.add(1.2f, 3.3));
        System.out.println(SimpleAdd.add(1.2f, 1.3f, 1.4f));

        System.out.println(DiscountCalc.discount(100f));
        System.out.println(DiscountCalc.discount(100, .1f));
        System.out.println(DiscountCalc.discount(100, "VIP"));
    }
}