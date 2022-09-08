/**
 * Created by "SumarK" On 3/6/2565 | 18:41
 * Copy&Paste Engineering. Good luck have fun.
 */
public class ThaiUtils {

    public static String arabicToThai(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current >= '0' && current <= '9'){
                // \u0030 = 0 (ศูนย์ เลขอารบิก)
                // \u0e50 = 0 (ศูนย์ เลขไทย)
                // \u0e59 = ๙
                sb.append((char) (current + '\u0e50' - '0'));
            }else {
                sb.append(current);
            }
        }
        return sb.toString();
    }

    public static String thaiNumeralToArabic(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current >= '\u0e50' && current <= '\u0e59'){
                // \u0030 = 0 (ศูนย์ เลขอารบิก)
                // \u0e50 = 0 (ศูนย์ เลขไทย)
                // \u0e59 = ๙
                sb.append((char) (current - '\u0e50' + '0'));
            }else {
                sb.append(current);
            }
        }
        return sb.toString();
    }



}
