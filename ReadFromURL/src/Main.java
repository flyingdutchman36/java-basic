import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        readTextFromUrl();
        demo();
        System.out.println(Arrays.toString(ImageIO.getReaderFormatNames()));
        System.out.println(Arrays.toString(ImageIO.getWriterFormatNames()));

    }

    public static void readTextFromUrl(){
        String urlString = "https://www.goal.com/en/lists/pogba-coutinho-hazard-most-expensive-transfer-flops-football-history/blte0e8ded442f2c60d";
        StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(urlString);
                BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
                String line;
                while ((line = r.readLine()) != null);{
                    sb.append(line);
                    sb.append(System.getProperty("line.separator"));
                }
                r.close();
                System.out.println(sb.toString());
            } catch (MalformedURLException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public static void demo(){
//        https://cdn.pixabay.com/photo/2022/04/19/18/38/bird-7143567_960_720.jpg
        String urlImageLocation = "https://cdn.pixabay.com/photo/2022/04/19/18/38/bird-7143567_960_720.jpg";
//        String urlImageLocation = "https://cdn.pixabay.com/photo/2021/12/28/20/06/flowers-6900123_960_720.jpg";
        try {
            URL url = new URL(urlImageLocation);
            BufferedImage img = ImageIO.read(url);
            File outputImgFile = new File("savedXXXImage.jpg");
            ImageIO.write(img, "jpg",outputImgFile);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}