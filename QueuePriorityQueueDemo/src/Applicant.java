/**
 * Created by "SumarK" On 19/8/2565 | 13:29
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Applicant {
    private String name;
    private int score;

    public Applicant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
