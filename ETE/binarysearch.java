import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] song = new String[n];
        for (int i = 0; i < n; i++) {
            song[i] = sc.nextLine();
        }

        String search = sc.nextLine();

        for (int i = 0; i < n; i++) {
            if (search.equals(song[i])) {
                System.out.println("Found at index " + (i+1));
            }
        }
    }
}
