import java.util.Scanner;

public class Cal {

    public static class abc extends Exception {
        public abc(String message) {
            super(message);
        }
    }

    public static double divide(int a, int b) throws abc {
        if (b == 0) {
            throw new abc("Division by zero is Not Allowed.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of A : ");
        int a = sc.nextInt();

        System.out.print("Enter Value of A : ");
        int b = sc.nextInt();


        try {
            double ans = divide(a,b);
            System.out.println("Ans: " + ans);
        } catch (abc e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
