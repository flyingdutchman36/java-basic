import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        demoFileWriter();
//        demoFileReader();
//        System.out.println(unicodeTable('a','z'));
//        WriterUnicodeTable();
//        demoReadAll();
//          demoReadLines();
//         demoFileWriter();
//         demoBufferFileWriter();
        demoFileReader();
        demoBufferFileReader();
        demoBufferFileReader2();
        demoBufferFileReader3(); // Recommend

    }

    public static void demoFileWriter(){
        long startTime = System.currentTimeMillis();
        String s = unicodeTable('A', 'z');
        try {
            FileWriter w = new FileWriter("output.txt");
            for (int i = 0; i < 2000; i++) {
                w.write(s);
            }
            w.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time = "+ (endTime-startTime) +" (ms)");
    }

    public static void demoBufferFileWriter(){
        long startTime = System.currentTimeMillis();
        String s = unicodeTable('A', 'z');
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter("output.txt"));
            for (int i = 0; i < 2000; i++) {
                w.write(s);
            }
            w.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time = "+ (endTime-startTime) +" (ms)");
    }

    public static void demoFileReader(){
        long startTime = System.currentTimeMillis();
        try {
            FileReader r = new FileReader("country.txt");
            int data;
            while ((data = r.read()) != -1){
                System.out.print((char)data);
            }
            r.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time = "+ (endTime-startTime) +" (ms)");
    }

    public static void demoBufferFileReader(){
        long startTime = System.currentTimeMillis();
        try {
            BufferedReader r = new BufferedReader(new FileReader("country.txt"));
//            int data;
//            while ((data = r.read()) != -1){
//                System.out.print((char)data);
//            }
            String s;
            while ((s = r.readLine()) != null){
                System.out.println(s);
            }
            r.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time = "+ (endTime-startTime) +" (ms)");
    }

    public static void demoBufferFileReader2(){
        long startTime = System.currentTimeMillis();
        try (BufferedReader r = new BufferedReader(new FileReader("country.txt"))){
            String s;
            while ((s = r.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time = "+ (endTime-startTime) +" (ms)");
    }

    /* Recommend */
    public static void demoBufferFileReader3(){
        long startTime = System.currentTimeMillis();
        try (BufferedReader r = Files.newBufferedReader(Paths.get("country.txt"))){
            String s;
            while ((s = r.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time = "+ (endTime-startTime) +" (ms)");
    }



    public static String unicodeTable(int fromCode, int toCode){
        StringBuilder sb = new StringBuilder();
        String ls = System.getProperty("line.separator");
        for (int i = fromCode; i < toCode; i++) {
            sb.append(String.format("%04X: %-4d: %c", i , i ,i));
            sb.append(ls);
        }
        return sb.toString();
    }

    public static void WriterUnicodeTable(){
        System.out.println(System.getProperty("user.home"));
        File f = new File(System.getProperty("user.home"), "NewUnicodeTable.txt");
        System.out.println(f.getAbsoluteFile());
        if (f.exists()){
            System.out.println("File is already existed.");
        }
        try {
            FileWriter w = new FileWriter(f);
            w.write(unicodeTable('ก','ฮ'));
            w.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void demoReadAll(){
        try {
            byte[] bytes = Files.readAllBytes(Paths.get("country.txt"));
            String s = new String(bytes);
            System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void demoReadLines(){
        try {
            List<String> lines = Files.readAllLines(Paths.get("country.txt"));
            for (String line: lines) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}