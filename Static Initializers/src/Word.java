import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by "SumarK" On 16/6/2565 | 21:51
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Word {
    private static Map<String, String> words = new LinkedHashMap<>();

    private int x;

    static {
        System.out.println("initializers was called");
        words.put("Hello", "Sawatdee(kub/kah)");
        words.put("Toilet", "Hong Nam");
        words.put("Water", "Nam");

    }

    public static String search(String key){
        return words.getOrDefault(key, "not found");
    }
}
