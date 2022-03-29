package at.campus02.iwi.pictures;

public class PictureApp {
    public static void main(String[] args) {
        Picture p = new Picture();
        p.width = 200;
        p.length = 100;

        System.out.println(p.totalPixels());
        System.out.println(p.totalSize(2));
        p.scale(0.5);
        System.out.println(p.width + " " + p.length);


    }
}
