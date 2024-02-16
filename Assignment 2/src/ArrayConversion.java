import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayConversion {
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> arrayList = Arrays.asList(array);
        System.out.println("Array converted to ArrayList:");
        System.out.println(arrayList);

        System.out.print("\nEnter the number of elements in the ArrayList: ");
        int m = scanner.nextInt();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        System.out.println("Enter the elements of the ArrayList:");
        for (int i = 0; i < m; i++) {
            arrayList2.add(scanner.nextInt());
        }

        Integer[] array2 = arrayList2.toArray(new Integer[arrayList2.size()]);
        System.out.println("\nArrayList converted to array:");
        System.out.println(Arrays.toString(array2));

        scanner.close();
    }
}
