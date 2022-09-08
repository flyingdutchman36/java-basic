/**
 * Created by "SumarK" On 4/6/2565 | 12:30
 * Copy&Paste Engineering. Good luck have fun.
 */
public abstract class MemberCard {
    private String firstName, lastName;

    public MemberCard() {

    }

    public MemberCard(String firstName, String lastName) {
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

    @Override
    public String toString() {
        return String.format("firstName = %s, lastName = %s", firstName, lastName);
//        return super.toString();
    }

    // this method is override.
    public float discount(float amount){
        if(amount > 1000f){
            return amount * .02f;
        }else {
            return amount;
        }
    }

    // must implement this method in subclass
    public abstract float rewardXPoint();

    // subclass can't override this method
    public final int calcPoint(float amount){
        return (int)((amount / 20) * rewardXPoint());
    }
}
