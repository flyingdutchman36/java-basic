public class Ep4_Conditional1 {

    public static boolean testScore(int interviewScore, int englishScore){
        boolean isOk;
        if(interviewScore > 70 || englishScore > 50) {
            isOk = true;
        }else {
            isOk = false;
        }
        return isOk;
    }

    public static void main(String[] args) {

        //boolean result = testScore(75, 60);
        System.out.println(testScore(75,30));

//      int score = 47;
//        if (score >= 50){
//            System.out.println("pass");
//        }else {
//            System.out.println("not pass");
//        }

    }

}
