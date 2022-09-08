public class Main {
    public static void main(String[] args) {
        Camera c = new Camera();
        c.changeAperture();
        c.takePhoto();
        c.hDynamicLength();
        System.out.println(ICamera.currentLocalDateTime());
    }
}