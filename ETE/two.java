import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        String str = sc.next();

        ArrayList<String> filteredList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (list.get(i).compareTo(str) > 0) {
                filteredList.add(list.get(i));
            }
        }

        System.out.println(filteredList);
    }
}
