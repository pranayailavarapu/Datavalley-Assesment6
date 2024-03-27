import java.util.Scanner;

public class NumberStats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        char choice;
        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            sum += num;
            count++;

            if (num < smallest) {
                smallest = num;
            }

            if (num > largest) {
                largest = num;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.printf("Average of all numbers entered: %.2f%n", average);
        }

        scanner.close();
    }
}

