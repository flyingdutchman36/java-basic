public class Main {
    public static void main(String[] args) {
        demo1();
        System.out.println("----------------------");
        demo2();
    }

    public static void demo1(){
        IMemberCard c1 = new SilverCard();
        System.out.println(c1.getClass().getName());
        System.out.println(c1.discount(100f));

        SilverCard c2 = new SilverCard();
        System.out.println(c2.getClass().getName());
        System.out.println(c2.discount(100f));
    }

    public static void demo2(){
        IMemberCard c1 = new SilverCard();
        receipt(c1, 100f);

        IMemberCard c2 = new PlatinumCard();
        receipt(c2, 100f);
    }

    public static void receipt(IMemberCard c, float amount){
        System.out.println(c.getClass().getName());
        System.out.printf("amount = %10.2f %n", amount);
        System.out.printf("discount = %10.2f %n", c.discount(amount));
        System.out.printf("net = %10.2f %n", amount - c.discount(amount));
    }

}