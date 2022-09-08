import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

//        Person p1 = new Person();

        Student s1 = new Student();
        s1.setFirstName("Peter");
        System.out.println(s1.getFirstName());
        s1.setGender("M");
        s1.setFaculty("Computer science");
        s1.setMajor("Security");
        s1.setDob(LocalDate.of(1995, Month.JUNE,13));
        System.out.println(s1.ageYears());

        Staff staff1 = new Staff();
        staff1.setFirstName("Mike");
        staff1.setLastName("Taylor");
        staff1.setOfficeLocation("223/1");
        staff1.setPosition("Accountant");
        staff1.setDob(LocalDate.of(1990, Month.JUNE,15));
        System.out.println(staff1);

        ExchangeStudent ex1 = new ExchangeStudent();
        ex1.setFirstName("Ei Ei");
        ex1.setMajor("cs");
        ex1.setPartnerUniversity("KMUTT");
    }

}