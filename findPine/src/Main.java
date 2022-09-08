import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("input n terms: ");
        float n = in.nextFloat();
        findPine(n);
    }

    private static void findPine(float n) {
        double pine=0;
        float powNumber=1;
        int count=1;
            for (int i=1; i<=n*2 ; i=i+2){
                System.out.println("Round ("+(count)+") "+pine+" + "+(4*(1f/i)) * Math.pow(-1,((powNumber)-1)));
                pine = pine + (4*(1f/i)) * Math.pow(-1,((powNumber++)-1));
                System.out.println("sum ("+(count++)+") = "+pine+"\n");
          }
        System.out.println("last summation = "+pine);
        }

}