import java.util.*;
public class twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
}
