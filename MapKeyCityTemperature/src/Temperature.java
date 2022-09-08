/**
 * Created by "SumarK" On 18/8/2565 | 14:29
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Temperature {
    private float high, low;

    public Temperature(float high, float low) {
        this.high = high;
        this.low = low;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "high=" + high +
                ", low=" + low +
                '}';
    }
}
