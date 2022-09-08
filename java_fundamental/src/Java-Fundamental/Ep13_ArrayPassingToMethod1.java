import java.util.Arrays;

public class Ep13_ArrayPassingToMethod1 {

    public static void demoT1(int[] x) { // pass by reference
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * 10;
        }
    }

    public static void t1(){
        int[] n = {2, 4, 6, 8}; // send address // same pointer in C
        System.out.println(Arrays.toString(n));
        demoT1(n); // ส่ง Array ไป ข้อมูลภายในเปลี่ยนก็เปลี่ยนเลย
        System.out.println(Arrays.toString(n));
    }

    public static void demoT2(int x){ // pass by value
        x *= 10;
    }

    public static void t2(){
        int n = 10;
        System.out.println(n);
        demoT2(n); // ส่งไปแล้ว 10 ก็ยังเป็น 10 เหมือนเดิม
        System.out.println(n);
    }

    public static void demoT3(String s){
        s = "new Peter asdasdasdasd";
    }

    public static void t3(){
        String name = "Peter Parker";
        System.out.println(name);
        demoT3(name);
        System.out.println(name);
    }

    public static void demoT4(String s[]){ // pass by reference
        s[0] = "Spider man";
    }

    public static void t4(){
        String name[] = {"Peter Parker"};
        System.out.println(name[0]);
        demoT4(name);
        System.out.println(name[0]);
    }

    public static void main(String[] args) {
//        t1();
//        t2();
//        t3();
        t4();

    }

}
