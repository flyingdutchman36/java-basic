import java.util.Scanner;

public class Ep2_BasicJAVA {

    public static int rectangle(int width, int height){
        return width * height;
    }

    public static int square(int width) {
//        return width*width;
        return  rectangle(width, width);
    }

    public static double triangle(double base, double height) {
        return .5 * base * height;
    }


    public static void main(String[] args) {
        System.out.println(triangle(4, 5.6));

        float vatRate = 0.07f;

        double d1 = 1.0 / 3.0;
        float f1 = 1.0f / 3.0f;

        System.out.println("double: " + d1);
        System.out.println("float: " + f1);

      /*
        int width; // -2^31 to 2^31-1
        int height;

        Scanner in = new Scanner(System.in);
        System.out.print("enter width: ");
        width = in.nextInt();
        System.out.print("enter height: ");
        height = in.nextInt();
        int area = rectangle(width, height);
        System.out.println("area ( " + width + " x " + height +" ) = " + area);
        System.out.println(square(5));

       */


    }

}
