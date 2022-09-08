/**
 * Created by "SumarK" On 16/6/2565 | 21:39
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Person {

    private String firstName, lastName;

    static {
        System.out.println("Static initializer was called");
    }

    public Person() {
        System.out.println("person constructor was called.");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
