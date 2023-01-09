import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scanner = new Scanner(System.in);

        // Stores the number.
        int n = scanner.nextInt();

        // Initializes the count variable.
        int count = 1;

        // Checks whether count is less than n.
        while (count <= n) {
            System.out.println(count);
            count++;
        }
    }
}