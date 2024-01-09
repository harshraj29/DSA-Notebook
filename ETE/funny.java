import java.util.*;
public class funny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc .nextInt();

        while(t>=0){
            int n = sc.nextInt();

            for (int i = n; i >= 1; i--) {
                if (isFunnyNumber(i)) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    public static boolean isFunnyNumber(int num) {
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length() - 1; i++) {
            int digit1 = Character.getNumericValue(numStr.charAt(i));
            int digit2 = Character.getNumericValue(numStr.charAt(i + 1));
            if (digit2 < digit1) {
                return false;
            }
        }
        return true;
    }
}
