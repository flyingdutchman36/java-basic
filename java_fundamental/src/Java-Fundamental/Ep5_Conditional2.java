public class Ep5_Conditional2 {

    public static String stormType(int speed) {
        String stormName = "";
        if(speed < 63){
            stormName = "Depression";
        }else if ( speed >= 63 && speed < 118) {
            stormName = "Tropical storm";
        }else {
            stormName = "Typhoon";
        }
        return  stormName;
    }

    public static String zodiac(int buddhistYear) {
        int z = buddhistYear % 12;
        String s = "";
        switch (z){
            case 0:
                s = "sssมะเส็ง";
                break;
            case 1:
                s = "sssมะเมีย";
                break;
            case 2:
                s = "ssมะเเม";
                break;
            case 3:
                s = "sssวอก";
                break;
            case 4:
                s = "ssระกา";
                break;
            case 5:
                s = "sssจอ";
                break;
            case 6:
                s = "sssกุน";
                break;
            case 7:
                s = "sssชวด";
                break;
            case 8:
                s = "ssssฉลู";
                break;
            case 9:
                s = "sssขาล";
                break;
            case 10:
                s = "sssเถาะ";
                break;
            case 11:
                s = "sssมะโรง";
                break;
        }
        return s;
    }

    public static String testSwitch(String s){
        String result = "";
        switch (s){
            case "one":
                result = "wan";
                break;
            case "two":
                result = "too";
                break;
            default:
                result = "otherอื่นๆ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(testSwitch("สอง"));
    }

}
