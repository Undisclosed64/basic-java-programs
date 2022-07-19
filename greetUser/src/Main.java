import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Hey " + name + ", we wish you an amazing day!");
    }
}