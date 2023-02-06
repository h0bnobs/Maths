import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.println(squareRoot(number));
    }
    //does logic for the square root.
    public static int squareRoot(double number) {
        //local variables
        double d;
        double squareRoot = number/2;
        //sqrt n+1 = (sqrt + (num / sqrt)) / 2.0
        do {
            d = squareRoot;
            squareRoot = (d + (number/d)) / 2;
        } while ((d - squareRoot) != 0);
        return (int) squareRoot;
    }
}
