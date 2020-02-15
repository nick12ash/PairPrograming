import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Letters alphabet = new Letters();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String userWord = userInput.nextLine();
        System.out.println("The score for the word " + userWord + " is:");
        System.out.println(alphabet.calculateScore(userWord));
    }
}
