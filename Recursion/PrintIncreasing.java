import java.util.Scanner;

public class PrintIncreasing {
    public static void print(int n) {
        //Base Case
        if(n == 0){
            return;
        } 

        //Recursive Call
        print(n-1);
        
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        print(n);
    }
}
