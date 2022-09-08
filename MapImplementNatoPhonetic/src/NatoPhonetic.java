import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by "SumarK" On 20/6/2565 | 0:49
 * Copy&Paste Engineering. Good luck have fun.
 */

public class NatoPhonetic {


    //    LinkedHashMap maintains the order in which keys were inserted into the map
    private static Map<String, String> m = new LinkedHashMap<>();   // the position of "0" is maintained

    static { // static run ครั้่งเดียว เวลาเริ่มโปรแกรม
        m.put("A", "Alpha");
        m.put("B", "Bravo");
        m.put("C", "Charlie");
        m.put("D", "Delta");
        m.put("E", "Echo");
        m.put("F", "Foxtrot");
        m.put("G", "Golf");
        m.put("H", "Hotel");
        m.put("I", "India");
        m.put("J", "Juliet");
        m.put("K", "Kilo");
        m.put("L", "Lima");
        m.put("M", "Mike");
        m.put("N", "November");
        m.put("O", "Oscar");
        m.put("P", "Papa");
        m.put("Q", "Quebec");
        m.put("R", "Romeo");
        m.put("S", "Sierra");
        m.put("T", "Tango");
        m.put("U", "Uniform");
        m.put("V", "Victor");
        m.put("W", "Whiskey");
        m.put("X", "X-ray");
        m.put("Y", "Yankee");
        m.put("Z", "Zulu");
        m.put("1", "One");
        m.put("2", "Two");
        m.put("3", "Three");
        m.put("4", "Four");
        m.put("5", "Five");
        m.put("6", "Six");
        m.put("7", "Seven");
        m.put("8", "Eight");
        m.put("9", "Nine");
        m.put("0", "Zero");
    }

    public static Map<String, String> getM() {
        return m;
    }

    public static String toPhonetic(String s) {
        StringBuilder sb = new StringBuilder();
        String c = "";
        for (int i = 0; i < s.length(); i++) {
            c = s.substring(i, i + 1).toUpperCase(); // แปลงทุกตัวเป็นตัวใหญ่หมดทีละตัว
            if (m.containsKey(c)) { // เช็คว่าตัวอักษรอยู่ใน map m ไหม
                sb.append(String.format("%s - %s%n", c, m.get(c))); // ใส่ข้อมูลเข้าไปใน sb
            } else {
                sb.append(String.format("%s - %s%n", c, c)); // พิมพ์ตัวเดิมออกมา
            }
        }
        return sb.toString();
    }

    public static void displayNatoPhoneticTable() {
        for (Map.Entry<String, String> item : m.entrySet()) {
            System.out.printf("%s - %s%n", item.getKey(), item.getValue());
        }
    }
}
