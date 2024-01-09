import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of elements in the arrays
        int x = sc.nextInt(); // The threshold value

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // Read elements into arr1
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Read elements into arr2
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int val = -1;

        // Find the index of the first element in arr1 that is greater than x
        for (int i = 0; i < n; i++) {
            if (arr1[i] > x) {
                val = i;
                break; // Exit the loop as soon as the condition is met
            }
        }

        // Check if a valid index was found and print the corresponding element from arr2
        if (val != -1 && val < n) {
            System.out.println(arr2[val]);
        } else {
            System.out.println("No element in arr1 is greater than " + x);
        }
    }
}
