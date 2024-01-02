import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (odd): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for a proper diamond pattern.");
            return;
        }

        int spaces = n / 2;
        int stars = 1;

        // Upper part of the diamond
        for (int i = 1; i <= n; i += 2) {
            printSpaces(spaces);
            printStars(stars);
            System.out.println();
            spaces--;
            stars += 2;
        }

        // Lower part of the diamond
        spaces = 1;
        stars = n - 2;
        for (int i = n - 2; i >= 1; i -= 2) {
            printSpaces(spaces);
            printStars(stars);
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }

    static void printSpaces(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(" ");
        }
    }

    static void printStars(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
    }
}

