import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public interface ICamera {
    void takePhoto();
    void changeAperture();

    default void hDynamicLength(){
        System.out.println("take 3 photos with different apertures and combine them together");
    }

    // public
    static LocalDateTime currentLocalDateTime(){
        return LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    }
}
