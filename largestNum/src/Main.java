import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int num = input.nextInt();
        System.out.print("Please input another number: ");
        int num2 = input.nextInt();
        if(num>num2){
            System.out.print(num + " is the largest one.");
        }
        System.out.print(num2 + " is the largest one.");
    }

}