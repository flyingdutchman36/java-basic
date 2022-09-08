import java.util.Arrays;

public class Ep14_ArrayPassingToMethod2 {

    public static void demoT5(String s[]){
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].toUpperCase();
        }
    }

    public static void t5(){
        String[] text = {"m", "a", "r", "k"};
        System.out.println(Arrays.toString(text));
        demoT5(text);
        System.out.println(Arrays.toString(text));
    }

    public static double[][] calMatrix(double[][] a, double[][] b){
        double[][] c = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void printMatrix(){
        double[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        double[][] b = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        double c[][] = calMatrix(a, b);
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println("Matrix "+i+""+j+" = "+c[i][j]);;
//            }
//        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(Arrays.toString(c[i]));
        }

    }

    public static void main(String[] args) {
        t5();
        printMatrix();
    }

}
