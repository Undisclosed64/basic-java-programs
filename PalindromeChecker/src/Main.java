import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the word: ");
        String word = in.next();
        String reversedString = "";
        char ch;
        for(int i=0; i<word.length(); i++){
            ch = word.charAt(i);
            //System.out.println(ch);
            reversedString = ch + reversedString;
        }
        if(reversedString.equals(word)){
            System.out.println("Reversed word: " + reversedString);
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println("Reversed word: " + reversedString);
            System.out.println(word + " is not a palindrome.");
        }
    }
}
