public class Ep7_ForLoop2AsciiNumber {

    public static void multiply(int mother, int end){
        for (int i=1; i<=end; i++){
            System.out.println(mother+" x "+ i + " = "+ mother*i);
        }

    }

    public static void printChar() {
        for (char c = 'A'; c <= 'Z'; c++){
            System.out.print(c);
        }
        System.out.println();
    }

    public static void printCharBetter(char fromCh, char toCh) {
        for (char c = fromCh; c <= toCh; c++){
            System.out.printf("%d %04X %c \n",(int)c ,(int)c ,c);
        }
    }

    public static void printChar2() {
        for (int c = 65; c <= 90; c++){
            System.out.printf("%d - > %c \n", c, (char)c);
        }
    }

    public static void main(String[] args) {
        multiply(5,12);
        printChar();
        printChar2();
        printCharBetter('A','z');
        printCharBetter('ก','ฮ');
    }

}
