import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Ep9_String1 {

    public static void demo1() {
        // String เป็น data type แบบ คลาส
        String s1 = "rain";
        String s2 = "bow";
        String s3 = s1 + s2;
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3.length());
//        System.out.println(s3.substring(0,4));
//        System.out.println(s3.substring(4));
//        System.out.println(s3.toUpperCase());
        System.out.println(stringWithPosition(s3));
        System.out.println(s3.indexOf("r"));
    }

    public static String stringWithPosition(String s){
        String pos = "";
        for (int i = 0; i < s.length(); i++) {
  //          pos += (i % 10);
           pos += i;
        }
        return String.format("index: [%s]\nvalue: [%s]", pos, s);
    }

    public static void demoCompare() {
        String s1 = "apple";
        if (s1 == "apple"){
            System.out.println("equal");
            System.out.println(s1.hashCode());
            System.out.println("apple".hashCode());
            System.out.println("apple"==s1);
        }else {
            System.out.println("not equal");
        }
    }

    public static void demoCompare2() {
        String s1 = "apple"; // string เก็บ address
        String s2 = "app"+"le"; // string เก็บ address
        System.out.println(s1+" vs "+s2);
        // == เป็นการเปรียบเทียบว่าสตริง 2 ตัวชี้ไปที่ตำแหน่งเดียวกันในหน่วยความจำหรือไม่
        // ไม่ได้เป็นการเปรียบเทียบค่าของแต่ละตัวอักษร มันเลยไม่เท่ากัน
        if (s1 == s2){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
        }
    }

    public static void demoCompare3() {
        String s1 = "apple"; // string เก็บ address
        String s2 = "App"; // string เก็บ address
        // เปรียบเทียบแบบไม่สนใจพิมพ์ใหญ่พิมพ์เล็ก
        // if (s1.equal(s2+"le") อันนี้สนใจพิมพ์ใหญ่พิมพ์เล็ก
        if (s1.equalsIgnoreCase(s2+"le")){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }

    public static void demoCompareTo(){
        String s1 = "apple";
        String s2 = "banana";
        System.out.println(s1.compareTo(s2));

        String s3 = "apple";
        System.out.println(s1.compareTo(s3));

        String s4 = "coconut";
        System.out.println(s4.compareTo(s1));
    }

    public static void main(String[] args) {
//        demo1();
//        demoCompare();
//        demoCompare2();
//        demoCompare3();
        demoCompareTo();
    }

}
