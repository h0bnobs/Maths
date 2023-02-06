
import java.util.Scanner;

public class FindInt {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next().toLowerCase();
        int index = alphabet.indexOf(word1) + 1;
        System.out.println(index);
    }
}

