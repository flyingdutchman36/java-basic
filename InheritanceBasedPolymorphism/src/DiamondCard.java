/**
 * Created by "SumarK" On 19/6/2565 | 0:35
 * Copy&Paste Engineering. Good luck have fun.
 */
public class DiamondCard extends MemberCard{
    @Override
    public float discount(float amount) {
        return amount * .20f;
    }

    @Override
    public boolean accessLounge() {
        return true;
    }

}
