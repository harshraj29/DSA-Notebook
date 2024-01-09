import java.util.*;
public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] alice = new int[n];
        int[] bob = new int[n];

        // Read elements into alice
        for (int i = 0; i < n; i++) {
            alice[i] = sc.nextInt();
        }

        // Read elements into bob
        for (int i = 0; i < n; i++) {
            bob[i] = sc.nextInt();
        }

        int count =0;

        for(int i = 0;i<n;i++){
            if(alice[i] * 2 > bob[i] && bob[i] * 2 > alice[i]){
                count++;
            }
        }

        System.out.println(count);
    }
}
