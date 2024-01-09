import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for(int i = 0; i <= n-k; i++) {
            int Num = 0;
            for(int j = i; j < i+k; j++) {
                if(arr[j] < 0) {
                    Num = arr[j];
                    break;
                }
            }
            System.out.print(Num+" ");
        }
    }
}