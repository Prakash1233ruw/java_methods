package Methods1;

public class RectangleArea {

    public static int area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        int result = area(10, 5);
        System.out.println("Area = " + result);
    }
}