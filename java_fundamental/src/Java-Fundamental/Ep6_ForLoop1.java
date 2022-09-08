public class Ep6_ForLoop1 {

    public static void main(String[] args) {
        int n=1;
        for (n=1; n<=10 ;n+=2){
            System.out.println(n);
        }
        System.out.println("bye");

        summation(1, 10);
    }

    public static void summation(int start, int end){
        int sum=0;
        int count=0;
        for (int i=start; i<= end; i++){
            sum=sum+i;
            System.out.println("round " + (count+1) + " " + sum + " = " + sum + " + "+i);
            count++;
        }
        System.out.println(sum);
    }

}
