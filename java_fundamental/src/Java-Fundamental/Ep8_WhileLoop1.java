import java.util.Scanner;

public class Ep8_WhileLoop1 {

    public static void demo() {
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }

    public static void demo2() {
        int i=1;
        do{
            System.out.println(i);
            i++;
        } while (i<=10);
    }

    public static void exercise(){
        double money = 100;
        int count=1;
        while(money <= 200){
            money*=1.05;
            System.out.printf("round %d) money = %.2f\n", count,money);
            count++;
        }
    }

    public static int exercise2(float deposit, float rate, float targetAmount){
        int years=1;
        deposit*=rate;
        while(deposit <= targetAmount){
            System.out.printf("round %d) money = %.2f\n", years, deposit);
            deposit*=rate;
            years++;
        }
        System.out.printf("round %d) money = %.2f\n", years, deposit);
        return years;
    }

    public static void sum(){
        int n=0, result=0;
        Scanner in = new Scanner(System.in);
        while(n != -1){
            System.out.print("Enter number: ");
            result += n;
            n = in.nextInt();
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
//        demo();
//        demo2();
//        exercise();
//        System.out.println("-----------------");
//        int n = exercise2(100.0f, 1.05f, 150.0f);
//        System.out.println("years needed = "+n);
        sum();

    }

}
