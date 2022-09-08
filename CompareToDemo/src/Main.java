public class Main {

    public static void main(String[] args) {
        System.out.println("-----------String ------");
        compareString("apple","banana");
        compareString("apple","apple");
        compareString("banana","apple");
        System.out.println("-----------Integer non primitive------");
        compareIntegerObject(5, 7);
        compareIntegerObject(5, 5);
        compareIntegerObject(7, 5);
        System.out.println("--------Int primitive------");
        compareIntegerPrimitive(5, 7);
        compareIntegerPrimitive(5, 5);
        compareIntegerPrimitive(7, 5);
        System.out.println("--------Float primitive------");
        compareFloatPrimitive(7.5f, 5.12f);
        compareFloatPrimitive(7.5f, 7.5f);
        compareFloatPrimitive(5.12f, 7.5f);
    }

    // -x แสดงว่าค่าตัวแรกอยู่ก่อนตัวที่สอง  x มีจำนวนเป็นเท่าไหร่ก็คือระยะห่างของเลข ASCII
    //  x ได้ค่าเป็น + แสดงว่า ตัวแรกอยู่ก่อนตัวที่สอง
    //  0 เท่ากัน

    // a < b  = -1
    // a > b  =  1
    // a = b  = 0

    public static void compareIntegerObject(Integer a, Integer b){
        System.out.printf("a = %d, b = %d, a.compareTo(b) = %d%n", a, b, a.compareTo(b));

    }

    public static void compareIntegerPrimitive(int a, int b){
        System.out.printf("a = %d, b = %d, a.compareTo(b) = %d%n", a, b, Integer.valueOf(a).compareTo(Integer.valueOf(b)));
    }

    public static void compareFloatPrimitive(float a, float b){
        System.out.printf("a = %.2f, b = %.2f, a.compareTo(b) = %d%n", a, b, Float.valueOf(a).compareTo(Float.valueOf(b)));
    }
    public static void compareString(String a, String b){
        System.out.printf("a = %s, b = %s, a.compareTo(b) = %d%n", a, b, a.compareTo(b));
    }





}