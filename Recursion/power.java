import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X :");
        int x = sc.nextInt();
        System.out.print("\nEnter N :");
        int n=sc.nextInt();

        System.out.println("Ans = "+ pow(x,n));
    }

    public static int pow(int x,int n){
        if(n == 0){
            return 1;
        }

        return x * pow(x , n-1);
    }
}
