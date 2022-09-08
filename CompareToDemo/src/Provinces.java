/**
 * Created by "SumarK" On 16/6/2565 | 19:10
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Provinces {
    private String nameTh, nameEn , abbr;
    private float area;

    public Provinces(String nameTh, String nameEn, String abbr, float area) {
        this.nameTh = nameTh;
        this.nameEn = nameEn;
        this.abbr = abbr;
        this.area = area;
    }

    public String getNameTh() {
        return nameTh;
    }

    public void setNameTh(String nameTh) {
        this.nameTh = nameTh;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
