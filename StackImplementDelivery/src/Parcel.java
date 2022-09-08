/**
 * Created by "SumarK" On 18/8/2565 | 15:39
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Parcel implements Comparable<Parcel>{
    private String id; // parcel id
    private float distance;

    public Parcel(String id, float distance) {
        this.id = id;
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id='" + id + '\'' +
                ", distance=" + distance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parcel parcel = (Parcel) o;

        if (Float.compare(parcel.distance, distance) != 0) return false;
        return id.equals(parcel.id);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (distance != +0.0f ? Float.floatToIntBits(distance) : 0);
        return result;
    }

    @Override
    public int compareTo(Parcel o) {
        if (Float.compare(this.getDistance(), o.getDistance()) == 0){
            return this.getId().compareTo(o.getId());
        } else {
            return -Float.compare(this.getDistance(), o.getDistance());
        }
    }
}
