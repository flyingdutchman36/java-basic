/**
 * Created by "SumarK" On 4/6/2565 | 12:52
 * Copy&Paste Engineering. Good luck have fun.
 */
public class PlatinumCard extends MemberCard{

    // annotation
    @Override
    public float discount(float amount) {
        return amount * .05f;
//        return super.discount(amount);
    }

    @Override
    public float rewardXPoint() {
        return 3f;
    }

}
