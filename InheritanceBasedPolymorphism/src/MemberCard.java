/**
 * Created by "SumarK" On 18/6/2565 | 23:56
 * Copy&Paste Engineering. Good luck have fun.
 */
public abstract class MemberCard {
    private String id, firstName, lastName;

    public float discount(float amount){
        return amount * .02f;
    }

    public abstract boolean accessLounge();
    public MemberCard() {
    }

    public MemberCard(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
