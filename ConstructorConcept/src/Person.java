/**
 * Created by "SumarK" On 16/6/2565 | 20:25
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Person {
    private String firstName, lastName, nickName, gender;

    public Person() {
        System.out.println("Hi I'm Person constructor Patient call me.");
    }

    public Person(String firstName, String lastName, String nickName, String gender) {
        setFirstName(firstName);
        this.lastName = lastName;
        this.nickName = nickName;
        this.gender = gender;
    }

    // chain constructor
    public Person(String firstName, String nickName){
        this(firstName, "", nickName, "");
    }

    public Person(String firstName, String lastName, String gender){
        this(firstName, lastName , "", "");
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.trim().substring(0,1).toUpperCase() +
                         firstName.trim().substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
