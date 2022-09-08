public class Main {

    public static void main(String[] args) {
        demo();
        demo2();


    }

    public static void demo(){
        Person p1 = new Person();
        Person p2 = new Person();
    }

    public static void demo2(){
        System.out.println(Word.search("Hello"));
        System.out.println(Word.search("Toilet"));
        System.out.println(Word.search("Water"));
        System.out.println(Word.search("Dragon"));
    }
}