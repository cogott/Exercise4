import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class areaOfRectangle {

    public static float length;
    public static float width;
    public static float area;

    public void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program will calculate the area of a rectangle");
        System.out.println("Please input the length of the rectangle and press Enter");
        length = Float.parseFloat(br.readLine());
        System.out.println("Please input the width of the rectangle and press Enter");
        width = Float.parseFloat(br.readLine());
    }

    public void computeField() {

        area = width * length;

    }

    public void displayField() {

        System.out.println("The area of your Rectangle is: ");
        System.out.println(area);
    }

    public static void rectangleArea() throws IOException {
        areaOfRectangle a = new areaOfRectangle();
        a.getData();
        a.computeField();
        a.displayField();
    }


    public static void main(String[] args) throws IOException {
        rectangleArea();


    }
}








