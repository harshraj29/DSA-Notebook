import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        int id = sc.nextInt();
        double salary = sc.nextDouble();

        if(id < 0){
            System.out.println("Invalid ID");
        }else if(salary < 0){
            System.out.println("Invalid Salary");
        }else{
            System.out.println("Data Processed");
        }
    }
}
