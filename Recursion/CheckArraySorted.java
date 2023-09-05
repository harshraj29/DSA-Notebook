import java.util.Scanner;

public class CheckArraySorted {

    // one way
    public static boolean isSorted(int arr[], int n) {
        if (n <= 1) {
            return true;
        }

        if (arr[n - 1] < arr[n - 2]) {
            return false;
        }

        return isSorted(arr, n - 1);
    }

    public static boolean isSorted_M2(int arr[], int i) {
        if (i >= arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted_M2(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted_M2(arr, 0));
        System.out.println(isSorted(arr, n));

    }
}
