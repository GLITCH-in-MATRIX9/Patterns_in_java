
    import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the diamond (odd number): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for a diamond with an odd number of stars.");
            return;
        }

        printOddDiamond(n);
    }

    static void printOddDiamond(int n) {
        int spaces = n / 2;
        int stars = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }
}

