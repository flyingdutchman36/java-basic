public class Ep11_ArrayMulti {

    public static void demo1 () {
        String[][] provinces = {
                {"bangkok", "chiang mai", "phuket", "Khonkaen"},
                {"bkk",     "cmm",         "htk",     "KK"}
        };
        for (int i = 0; i < provinces.length; i++) {
            for (int j = 0; j < provinces[i].length; j++){
                System.out.printf("row [%d] column [%d] = %s\n",i ,j ,provinces[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        demo1();

    }

}
