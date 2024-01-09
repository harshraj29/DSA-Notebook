import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");
        int count = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<word.length;i++){
            int len = word[i].length();
            maxi = Math.max(maxi, len);
            len = 0;
        }

        System.out.println(maxi);
    }
}
