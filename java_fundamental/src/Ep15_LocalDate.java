import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Ep15_LocalDate {

    public static void main(String[] args) {
        LocalDate today  = LocalDate.now(); // today -> instance / object
        System.out.println(today);
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());

        LocalDate day199 = LocalDate.ofYearDay(2014, 199);
        System.out.println(day199);

        LocalDate myBirthDay = LocalDate.of(2001, Month.JUNE, 15);
        System.out.println(myBirthDay.until(today, ChronoUnit.DAYS));

        System.out.printf("age = %d years %d month %d day", myBirthDay.until(today).getYears(), myBirthDay.until(today).getMonths(), myBirthDay.until(today).getDays());

    }

}
