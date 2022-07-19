import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the principal balance: ");
        float principal = input.nextFloat();

        System.out.print("Please input the time in years: ");
        int time = input.nextInt();

        System.out.print("Please input the rate: ");
        float rate = input.nextFloat();

        float A;
        A = principal * time * rate / 100;
        System.out.print("Your simple interest is: " + A);



    }
}