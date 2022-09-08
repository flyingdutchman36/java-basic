import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        demo1();
    }

    public static void demo1(){
        // Map Interface
        // HashMap implements Map interface
        Map<String, String> m = new HashMap<String, String>();

        //     key   Values
        m.put("cn", "China");
        m.put("th", "thailand");
        m.put("jp", "Japan");

        System.out.println(m.get("cn"));

        for (Map.Entry<String, String> item : m.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s \n", key, value);
        }

        m.put("th", "Siam");
        System.out.println();
        for (Map.Entry<String, String> item : m.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s \n", key, value);
        }

        if (m.containsValue("Japan")){
            System.out.println("found Japan");
        }

        if (m.containsKey("cn")){
            System.out.println("found cn");
            m.remove("cn");
        }

        System.out.println();
        for (Map.Entry<String, String> item : m.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s \n", key, value);
        }


    }

}