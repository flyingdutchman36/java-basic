public class Main {
    public static void main(String[] args) {
//        demo();
//        demo2();
//        demo3();
        demo4();

    }

    public static void demo4(){
        Patient p1 = new Patient();
        Patient p2 = new Patient("Peter", "Parker", "M", "Pete", 170f, 70f);
        System.out.println(p2);
    }

    public static void demo(){

        Person p1 = new Person();
        p1.setFirstName("Peter");
        p1.setLastName("Parker");
        p1.setNickName("Pete");
        p1.setGender("M");

        System.out.println(p1);

    }

    public static void demo2(){
        Person p2 = new Person("     peTER2          ","Parker2","Pete2","M2");
        System.out.println(p2);
        System.out.println(p2.getFirstName());

    }

    public static void demo3(){
        Person p3 = new Person("PeterERERERERER3", "Parker3");
        System.out.println(p3.getFirstName());
    }

}