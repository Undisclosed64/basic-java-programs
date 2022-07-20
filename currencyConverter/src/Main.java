import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount in ₹: ");
        float rupees = in.nextFloat();
        double output = rupees / 61.06;
        System.out.println( rupees + " is " + output + " USD");
    }
}