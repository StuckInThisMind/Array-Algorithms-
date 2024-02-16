import java.util.Scanner;

public class EvenOddNumbers {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int[] even;
        int[] odd;
        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        even = new int[n];
        odd = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                even[evenCount++] = num;
            } else {
                odd[oddCount++] = num;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }

        scanner.close();
    }
}
