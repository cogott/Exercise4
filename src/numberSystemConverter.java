import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class numberSystemConverter {
    public static void main(String[] args) throws IOException {
        int baseSystem, targetSystem, numFromDecimalSystem;
        String numToDecimalSystem, number1, number2, choose;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("");//Blank Line
            System.out.println("Choose Operation you want to perform");
            System.out.println(" ");
            System.out.println("A. Convert from any system to the decimal system");
            System.out.println("B. Convert from decimal system to another system");
            System.out.println("C. Summing up numbers from other systems");
            System.out.println("D. Subtracting numbers from different systems");
            System.out.println("E. Multiplying numbers from different systems");
            System.out.println("F. Dividing numbers from different systems");
            System.out.println(" ");
            System.out.println("W. Exit Page");

            choose = br.readline();

            if(choose.equals("A.")){
                System.out.println("Enter the value you want to be converted to the decimal system");
                numToDecimalSystem = br.readLine();

                System.out.println("What system is the number from?");
                baseSystem = Integer.parseInt(br.readLine());

                System.out.println((numToDecimalSystem,(baseSystem));
            }
        }

    }
}
