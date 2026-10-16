import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter your decimal: ");
        double number= input.nextDouble();
        System.out.println("My decimal is " + number);
        input.close();

    }
}
