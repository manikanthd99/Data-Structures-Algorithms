import java.util.Scanner;

//Move all zeroes to end of  an array
public class MoveZeroesToEnd {

    public static void moveZeroesToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;

        // Move non-zero elements to the front of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill remaining elements with zeroes
        while (nonZeroIndex < n) {
            arr[nonZeroIndex++] = 0;
        }
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

        // Move zeroes to the end of the array
        moveZeroesToEnd(arr);

        // Print the modified array
        System.out.println("Array after moving zeroes to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
