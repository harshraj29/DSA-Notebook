import java.util.Scanner;

class PrintDec{
    public static void print(int n) {
        //Base Case
        if(n == 0){
            return;
        } 

        System.out.print(n + " ");

        //Recursive Call
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        print(n);
    }
}