import java.util.*;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        String numberAsString = Integer.toString(n);
        int size = numberAsString.length();
        while(temp != 0){
            int d = temp % 10;
            sum += Math.pow(d,size);
            temp /= 10;
        }

        if(sum == n){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
