import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count =0;
        for (int i = 1; i <= N; i++) {
            for(int j = 0 ;j <32 ;j++){
                 int bitMask = 1 << j;

                if ((bitMask & i) != 0) {
                    count++; 
                }
            }
           
        }

        System.out.println("Total number of Set bits are "+count);
    }
}
