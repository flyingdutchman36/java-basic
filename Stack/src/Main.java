import java.util.Stack;

public class Main {

    public static void main(String[] args) {
       // demo();
        System.out.println(reverseString("Love"));
    }

   /* public static void demo() {
        Stack<String> st = new Stack<>();
        st.push("mango0"); // 5
        st.push("mango1"); // 4
        st.push("mango2"); // 3
        st.push("mango3"); // 2
        st.push("mango4"); // 1

        System.out.println(st);
        System.out.println(st.peek()); // find last data of stack
        System.out.println(st);
        System.out.println(st.pop()); // delete last data of stack
        System.out.println(st);

        System.out.println(st.search("mango4"));
        System.out.println(st.search("mango3"));
        System.out.println(st.search("mango2"));
        System.out.println(st.search("mango1"));

        System.out.println(st.contains("mango1"));
        System.out.println(st.contains("mango4"));

        System.out.println("....popping...");

        while (!st.empty()){
            System.out.println(st.pop());
        }

        System.out.println(st);
    }
*/
    public static String reverseString(String s){
        // love -> evol
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            System.out.println(st);
        }

        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            System.out.println(st.peek());
            sb.append(st.pop());
        }
        return sb.toString();
    }
}