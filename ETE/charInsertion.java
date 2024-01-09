import java.util.*;

public class charInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[2];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        for (int i = 0; i < str.length() - 1; i++) {
            if(i == arr[0] || i == arr[1]){
                System.out.print("*");
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }
}
