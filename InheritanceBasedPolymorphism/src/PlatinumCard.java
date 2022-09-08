/**
 * Created by "SumarK" On 19/6/2565 | 0:24
 * Copy&Paste Engineering. Good luck have fun.
 */
public class PlatinumCard extends MemberCard{
    @Override
    public float discount(float amount) {
        return amount * .10f;
    }

    @Override
    public boolean accessLounge() {
        return true;
    }
}
