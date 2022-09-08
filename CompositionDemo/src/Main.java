import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        demo();
        demo2();
    }

    public static void demo(){
        Person p1 = new Person("Mr.", "Peter", "Parker", LocalDate.of(1995, Month.JULY, 17));
        System.out.println(p1);

        Person p2 = new Person("Mr.", "Peter", "Parker",
                               "Nai", "ThPeter", "ThParker", LocalDate.of(1995, Month.JULY, 17) );
        System.out.println(p2);
    }

    public static void demo2(){
        PersonV2 p1 = new PersonV2();
        PersonName th = new PersonName("Nai", "ThPeter", "ThParker");
        PersonName en = new PersonName("Mr.", "Peter", "Parker");
        p1.setNameTh(th);
        p1.setNameEn(en);
        p1.setDob(LocalDate.of(1995, Month.JULY, 17));

        Map<String, String> phone = new HashMap<String, String>();
        phone.put("mobile", "0812345678");
        phone.put("home", "055555");
        phone.put("office", "02222222");
        phone.put("office2","03333333");

        p1.setPhone(phone);

        PersonV2 p2 = new PersonV2(new PersonName("Nai", "ThPeter", "ThParker"),
                                   new PersonName("Mr.", "Peter", "Parker"),
                                   LocalDate.of(1995, Month.JUNE, 15));
        System.out.println(p1);
        System.out.println(p2);
    }
}