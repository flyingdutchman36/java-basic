import java.util.Scanner;

public class Ep1_BasicJAVA {

    public static void main(String[] args) {
        System.out.println(3*5);
        System.out.println("area = " + 3*5);

        int width; // -2^31 to 2^31-1
        int height;
        int area;
//        width = 3;
//        height = 5;
//        area = width * height;
//        System.out.println("area = " + area);

        Scanner in = new Scanner(System.in);
        System.out.print("enter width: ");
        width = in.nextInt();
        System.out.println("print width = " + width);
        System.out.print("enter height: ");
        height = in.nextInt();
        System.out.println("print height = " + height);
        System.out.println("area ( " + width + " x " + height +" ) = " + width*height);


    }

}
