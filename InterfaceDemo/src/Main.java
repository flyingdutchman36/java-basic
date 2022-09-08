import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        demo1();
        demo2();
    }

    public static void demo1(){
        Sedan s = new Sedan();
        System.out.println(s.cashRate());

        Vehicle v = new Sedan(); // using an interface as type
        System.out.println(v.ePassRate());


    }

    public static void demo2(){
        Vehicle v = null; // v ชี้ไปยัง object ที่สร้างมาจาก subclass ที่ implement Vehicle Interface ได้
        for (int i = 0; i < 20; i++) {
            int r = randomBetween(0, 2);
            switch (r){
                case 0:
                    v = new Sedan();
                    break;
                case 1:
                    v = new Truck();
                    break;
                case 2:
                    v = new Bus();
                    break;
                default:
                    v = new Sedan();
            }
            int paymentType = randomBetween(0, 1);
            int rate = 0;
            if(paymentType == 0){
                rate = v.cashRate();
                System.out.println("Vehicle type = "+v.getClass().getName()+" rate(cash) = "+rate);
            }else {
                rate = v.ePassRate();
                System.out.println("Vehicle type = "+v.getClass().getName()+" rate(ePass) = "+rate);
            }
        }
    }

    // example popular case with interface
    public static void  demo3(){
        List<String> coffees = new ArrayList<String>();
    }

    public static int randomBetween(int fromNumber, int toNumber){
        Random r = new Random();
        return r.nextInt(toNumber + 1 - fromNumber) + fromNumber;
    }
}