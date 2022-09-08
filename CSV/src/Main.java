import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        demoBufferReader();
//        testSplit();
    }

    public static void testSplit(){
        String s = "United,405,0.027";
        String [] data = s.split(",");
        System.out.println(Arrays.toString(data)); // "405.3" String
        float amount = Float.parseFloat(data[1]);
        System.out.println(amount);
    }

    public static void demoBufferReader(){
        float total = 0.0f;
        try{
            BufferedReader r = new BufferedReader(new FileReader("research.txt"));
            String s = "";
            while ((s = r.readLine())!=null){
                String [] data = s.split("\\|");
                total = total + Float.parseFloat(data[1]);
//                System.out.println(s);
            }
            r.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.printf("total research and development (Billion US$) = %.2f", total);
    }

}