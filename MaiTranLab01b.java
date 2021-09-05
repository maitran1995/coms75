import java.util.Scanner;  // Import the Scanner class

public class MaiTranLab01b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number in pounds");
        int p = input.nextInt();  // Read user


        double kg = 0.454 ;
        double res ;
        res = p * kg ;
        System.out.print("Result: " + res) ;



    }
}
