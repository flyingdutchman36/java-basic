/**
 * Created by "SumarK" On 19/6/2565 | 0:48
 * Copy&Paste Engineering. Good luck have fun.
 */
public class GoldCard implements IMemberCard{

    @Override
    public float discount(float amount) {
        return amount * .05f;
    }

    @Override
    public boolean accessLounge() {
        return false;
    }
}
