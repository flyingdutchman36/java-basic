/**
 * Created by "SumarK" On 18/6/2565 | 23:58
 * Copy&Paste Engineering. Good luck have fun.
 */
public class GoldCard extends MemberCard{

    @Override
    public float discount(float amount) {
        return amount * .05f;
    }

    @Override
    public boolean accessLounge() {
        return false;
    }
}
