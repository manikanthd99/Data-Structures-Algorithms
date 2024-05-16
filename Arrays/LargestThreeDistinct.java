import java.util.Arrays;
import java.util.Scanner;


//Find the largest three distinct elements in an array
public class LargestThreeDistinct {

    public static int[] findLargestThreeDistinct(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int[] result = new int[3];
        int resultIndex = 0;

        // Start from the end of the sorted array and find the largest three distinct elements
        for (int i = n - 1; i >= 0 && resultIndex < 3; i--) {
            if (i == n - 1 || arr[i] != arr[i + 1]) {
                result[resultIndex] = arr[i];
                resultIndex++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Take input for the elements of the array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the largest three distinct elements
        int[] largestThree = findLargestThreeDistinct(arr);

        // Print the largest three distinct elements
        System.out.println("The largest three distinct elements are: " + Arrays.toString(largestThree));
    }


}
