import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Random;

public class Main {
    static Stack<Parcel> st = new Stack<>();


    public static void main(String[] args) {
        createData();
    }

    public static void createData(){
        Set<Parcel> p = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            p.add(new Parcel("parcel #" + i, randomBetween(1,30)));
        }

        for (Parcel parcel : p) {
            //System.out.println(parcel);
        }

        System.out.println("------packing order to car---------");
        int i=1;
        for (Parcel parcel : p) {
            System.out.println("order "+i+" "+parcel);
            i++;
            st.push(parcel);
        }

        System.out.println("\n\n------delivery order---------");
        int j=1;
        while (!st.empty()){
            System.out.println("delivering order "+j+" ..." + st.peek());
            j++;
            st.pop();
        }
    }

    public static int randomBetween(int fromNumber, int toNumber){
        Random r = new Random();
        return r.nextInt(toNumber + 1 - fromNumber) + fromNumber;
    }

}