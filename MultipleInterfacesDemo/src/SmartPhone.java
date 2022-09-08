/**
 * Created by "SumarK" On 6/6/2565 | 13:26
 * Copy&Paste Engineering. Good luck have fun.
 */
public class SmartPhone implements IPhone, ICamera, IGps{
    @Override
    public void takePhoto() {

    }

    @Override
    public float receiveLat() {
        return 0;
    }

    @Override
    public float receiveLon() {
        return 0;
    }

    @Override
    public boolean isGpsEnabled() {
        return false;
    }

    @Override
    public void changeAperture() {

    }

    @Override
    public void changeShutterSpeed() {

    }

    @Override
    public void deletePhoto() {

    }

    @Override
    public void call(String phoneNumber) {

    }

    @Override
    public void hangup() {

    }

    @Override
    public void sendSms(String phoneNumber, String message) {

    }
}
