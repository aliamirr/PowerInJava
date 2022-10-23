import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num, pow;
        System.out.println("Enter the Number: ");
        Scanner inp = new Scanner(System.in);
        num = inp.nextDouble();
        System.out.println("Enter the Power: ");
        pow = inp.nextDouble();
        System.out.println(num + " raised to the " + pow + " is " + Math.pow(num, pow));
    }
}