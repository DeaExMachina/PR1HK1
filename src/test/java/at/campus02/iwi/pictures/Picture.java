package at.campus02.iwi.pictures;

public class Picture {

    public int width;
    public int length;


    public int totalPixels() {
        return length * width;
    }

    public int totalSize(int bytePerPixel) {
        return totalPixels() * bytePerPixel;
    }

    public void scale(double factor) {
        length = (int)(length * factor);
        width *= factor;
    }



}
