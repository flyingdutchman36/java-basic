public class Utils {

    public static String capitalizedFirstCharOfString(String s){
        // static method -> class method
        return s.substring(0, 1).toUpperCase() +
                s.substring(1).toLowerCase();
    }

}
