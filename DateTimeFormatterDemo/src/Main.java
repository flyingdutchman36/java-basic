import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        demo();
        demo2();
    }

    public static void demo() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        System.out.println(now.format(formatter));
    }

    public static void demo2() {
        String [] patterns = {
                "yyyy-MM-dd",
                "yyyy-MMM-d",
                "E,yyyy-MMMM-d",
                "EE,yyyy-MMMM-d hh:mm",
                "EEE,yyyy-MMMM-d kk:mm",
                "EEEE,yyyy-MMMM-d kk:mm:ss 'o''clock'"
        };
        LocalDateTime now = LocalDateTime.now();

        for (String pattern : patterns) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            System.out.printf("%30s -> %s%n",pattern, now.format(formatter));
        }

    }

}