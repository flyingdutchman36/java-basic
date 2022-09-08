public class Box {

    private double width, height, depth;

    public Box() {

    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "BoxV3{" +
                "w=" + width +
                ", h=" + height +
                ", d=" + depth +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double volume(){
        return width * height * depth;
    }

    public double surfaceArea(){
        return (2.0 * width * height) + (2.0 * width * depth) + (2.0 * depth * height);
    }

}
