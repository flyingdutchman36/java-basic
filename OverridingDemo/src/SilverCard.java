/**
 * Created by "SumarK" On 4/6/2565 | 13:15
 * Copy&Paste Engineering. Good luck have fun.
 */
public class SilverCard extends MemberCard{
    @Override
    public float discount(float amount) {
        if (amount > 2000f){
            return amount * 0.3f;
        }else{
            return amount;
        }
    }

    @Override
    public float rewardXPoint() {
        return 1f;
    }
}
