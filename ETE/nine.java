import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String largerText = sc.nextLine();
        String targetSubstring = sc.nextLine();

        List<Integer> positions = new ArrayList<>();

        int index = -1;
        while ((index = largerText.indexOf(targetSubstring, index + 1)) != -1) {
            positions.add(index);
        }

        if (positions.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(positions);
        }
    }
}
//Chat gpt