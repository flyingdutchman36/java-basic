import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
////        System.out.println("\nTree Map vs Hash Map ");
//        System.out.println("\nTree Map ");
//        treeMapDemo();
////        System.out.println("\nHash Map ");
////       hashMapDemo();
        System.out.println(gradeLetter(50));
        System.out.println(gradeLetterTreeMap(50));

        System.out.println(gradeLetter(105));
        System.out.println(gradeLetterTreeMap(105));
    }

    public static void treeMapDemo(){
        TreeMap<Integer, String> m = new TreeMap<Integer, String>();
        m.put(1133, "contact 1133");
        m.put(183,  "contact 183");
        m.put(189, "contact 189");
        for (Map.Entry<Integer, String> item : m.entrySet()) {
            Integer key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
        }
    }

    public static String gradeLetterTreeMap(int score){
        TreeMap<Integer, String> gradeMap = new TreeMap<Integer, String>();
        gradeMap.put(0, "F"); // [0, 50)
        gradeMap.put(50, "D"); // [50, 60)
        gradeMap.put(60, "C"); // [60, 70)
        gradeMap.put(70, "B"); // [70, 80)
        gradeMap.put(80, "A"); // [80, 100)

        // สมมติ score = 65   65 อยู่ระหว่าง 60-70 floorEntry = 60 getValue ก็จะได้ C
        return gradeMap.floorEntry(score).getValue();
    }

    public static String gradeLetter(int score){
        /*
        0 - 49 F
        50 - 59 D
        60 - 69 C
        70 - 79 B
        80 - 100 A
         */
        String grade = "";
        if (score >= 80){
            grade = "A";
        } else if (score >= 70){
            grade = "B";
        }
        else if (score >= 60){
            grade = "C";
        }
        else if (score >= 50){
            grade = "D";
        }
        else {
            grade = "F";
        }
        return grade;
    }

//    public static void hashMapDemo(){
//        Map<Integer, String> m = new HashMap<Integer, String>();
//        m.put(1133, "contact 1133");
//        m.put(183,  "contact 183");
//        m.put(189, "contact 189");
//        for (Map.Entry<Integer, String> item : m.entrySet()) {
//            Integer key = item.getKey();
//            String value = item.getValue();
//            System.out.printf("%s => %s\n", key, value);
//        }
//    }
}