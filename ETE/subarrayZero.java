import java.util.*;

public class subarrayZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        boolean foundZeroSum = false;

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if (sum == 0) {
                foundZeroSum = true;
                System.out.println(arr[i]);
            }

            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    foundZeroSum = true;
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

        if (!foundZeroSum) {
            System.out.println("-1");
        }
    }
}
