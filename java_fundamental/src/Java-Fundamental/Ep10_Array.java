public class Ep10_Array {

    public static void demo1(){
        int[] scores = new int[5]; // 0-4
        scores[0] = 10;
        scores[1] = 15;
        scores[2] = 20;
        scores[3] = 25;
        scores[4] = 30;

        int sum=0;
        for(int i=0; i<scores.length; i++){
            sum+=scores[i];
        }
        System.out.println(sum);
    }

    public static void demo2(){
        int [] scores = {10, 15, 20, 25, 30, 100};
        int sum=0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }
        System.out.println(sum);
    }

    public static void demo3() {
        String[] coffee = {"Mocha", "Espresso"};
        for (int i = 0; i <  coffee.length; i++) {
            System.out.println(coffee[i]);
        }
    }


    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

}
