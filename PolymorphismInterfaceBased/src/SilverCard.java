/**
 * Created by "SumarK" On 19/6/2565 | 0:47
 * Copy&Paste Engineering. Good luck have fun.
 */
public class SilverCard implements IMemberCard{

    @Override
    public float discount(float amount) {
        return amount * .02f;
    }

    @Override
    public boolean accessLounge() {
        return false;
    }
}
