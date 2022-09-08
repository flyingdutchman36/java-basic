import java.util.Locale;

public class Utils {

    public static float vatRate = 0.07f;
    public static String capitalizedFirstChar(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static String removeAllNonNumeric(String s){
        return s.replaceAll("[\\D]","");
    }

}
