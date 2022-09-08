/**
 * Created by "SumarK" On 7/6/2565 | 14:21
 * Copy&Paste Engineering. Good luck have fun.
 */
public class Country {
    private String nameEn, nameTh, nameJP;

    public Country(String nameEn, String nameTh, String nameJP) {
        this.nameEn = nameEn;
        this.nameTh = nameTh;
        this.nameJP = nameJP;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameEn='" + nameEn + '\'' +
                ", nameTh='" + nameTh + '\'' +
                ", nameJP='" + nameJP + '\'' +
                '}';
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameTh() {
        return nameTh;
    }

    public void setNameTh(String nameTh) {
        this.nameTh = nameTh;
    }

    public String getNameJP() {
        return nameJP;
    }

    public void setNameJP(String nameJP) {
        this.nameJP = nameJP;
    }
}
