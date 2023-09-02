import java.util.Scanner;

public class fibonacci {
    public static int fib(int n) {
        //Base Case
        if(n == 0 || n == 1){
            return n;
        } 

        // int fibn = fib(n-2) + fib(n - 1);
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
       System.out.println(fib(n));
    }
}
