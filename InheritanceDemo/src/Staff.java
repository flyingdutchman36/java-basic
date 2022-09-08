/**
 * Created by "SumarK" On 3/6/2565 | 19:10
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Staff extends Person{
    private String officeLocation;
    private String position;

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "officeLocation='" + officeLocation + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
