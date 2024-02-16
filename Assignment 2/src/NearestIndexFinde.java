import java.util.Scanner;

public class NearestIndexFinder {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int nearestIndex = findNearestIndex(arr);
        if (nearestIndex != -1) {
            System.out.println("Nearest neighbours are at index " + nearestIndex + " and " + (nearestIndex + 1));
        } else {
            System.out.println("Array is empty or has only one element.");
        }

        scanner.close();
    }

    private int findNearestIndex(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int minDistance = Integer.MAX_VALUE;
        int nearestIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            int distance = Math.abs(arr[i] - arr[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                nearestIndex = i;
            }
        }
        return nearestIndex;
    }
}
