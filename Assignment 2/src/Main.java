import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Separate Even and Odd Numbers");
        System.out.println("2. Find Nearest Index");
        System.out.println("3. Convert Array to ArrayList and Vice Versa");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                EvenOddNumbers evenOddNumbers = new EvenOddNumbers();
                evenOddNumbers.execute();
                break;
            case 2:
                NearestIndexFinder nearestIndexFinder = new NearestIndexFinder();
                nearestIndexFinder.execute();
                break;
            case 3:
                ArrayConversion arrayConversion = new ArrayConversion();
                arrayConversion.execute();
                break;
            default:
                System.out.println("Invalid option");
        }

        scanner.close();
    }
}
