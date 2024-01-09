import java.util.*;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        int n = sc.nextInt();

        if (n > ch.length) {
            System.out.println("-1");
        } else {
            for (int i = n; i < ch.length; i++) {
                System.out.print(ch[i] + " ");
            }

            for (int i = 0; i < n; i++) {
                System.out.print(ch[i] + " ");
            }
        }
    }
}
