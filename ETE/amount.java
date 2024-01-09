import java.util.*;

public class amount {
    public static String arrangeCoinsToLargestValue(int[] coins) {
        String[] coinStrings = new String[coins.length];
        for (int i = 0; i < coins.length; i++) {
            coinStrings[i] = String.valueOf(coins[i]);
        }

        Arrays.sort(coinStrings, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder result = new StringBuilder();
        for (String coinString : coinStrings) {
            result.append(coinString);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Sample Input
        int[] coins = {54, 546, 548, 60};

        // Call the function and print the result
        String largestValue = arrangeCoinsToLargestValue(coins);
        System.out.println(largestValue);
    }
}
