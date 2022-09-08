import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Provinces> list = createProvinceList("provinces.csv");

//        list.sort(comparatorByArea()); // Java 8

//        Collections.sort(list, comparatorByArea());

        /* sort by area */
//        list.sort(new Comparator<Provinces>() {
//            @Override
//            public int compare(Provinces o1, Provinces o2) {
//                return -Float.valueOf(o1.getArea()).compareTo(Float.valueOf(o2.getArea()));
//            }
//        });

        /* sort by text */
//        list.sort(new Comparator<Provinces>() {
//            @Override
//            public int compare(Provinces o1, Provinces o2) {
//                return o1.getNameEn().compareTo(o2.getNameEn());
//            }
//        });

        /* sort by length */
//        list.sort(new Comparator<Provinces>() {
//            @Override
//            public int compare(Provinces o1, Provinces o2) {
//                return o1.getNameThLength() - o2.getNameThLength();
//            }
//        });

        /* multiple sort */
        list.sort(new Comparator<Provinces>() {
            @Override
            public int compare(Provinces o1, Provinces o2) {
                if (o1.getNameThLength() == o2.getNameThLength()){
                    return -o1.getNameEn().compareTo(o2.getNameEn());
                } else {
                    return o1.getNameThLength() - o2.getNameThLength();
                }

            }
        });

        showList(list);
    }

    public static void showList(List<Provinces> list){
        for (Provinces provinces:list) {
            System.out.printf("%s %s %s %,.2f %d %n",provinces.getNameTh(), provinces.getNameEn(), provinces.getAbbr(), provinces.getArea(), provinces.getNameThLength());
        }
    }

    public static Comparator comparatorByArea(){
        Comparator cmp = new Comparator<Provinces>() {
            @Override
            public int compare(Provinces o1, Provinces o2) {
                return Float.valueOf(o1.getArea()).compareTo(Float.valueOf(o2.getArea()));
            }
        };
        return cmp;
    }
    public static List<Provinces> createProvinceList(String fileName){
        List<Provinces> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = br.readLine()) != null){
                String[] data = line.split("\\|");
                list.add(new Provinces(data[0], data[1], data[2], Float.parseFloat(data[3])));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e ){
            e.printStackTrace();
        }
        return list;
    }


}