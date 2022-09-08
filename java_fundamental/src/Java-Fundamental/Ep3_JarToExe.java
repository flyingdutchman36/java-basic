import java.util.Scanner;

public class Ep3_JarToExe {

    public static void main(String[] args) {

        double width, height, area;
        Scanner in = new Scanner(System.in);

        System.out.print("enter width: ");
        width = in.nextDouble();

        System.out.print("enter height: ");
        height = in.nextDouble();

        area = width * height;

        System.out.println("area = " + area);
    }

}
