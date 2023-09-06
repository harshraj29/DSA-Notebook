import java.util.Scanner;

public class FriendsPair {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter KEY : ");
        int key = sc.nextInt();

        System.out.println(first(arr,key,0));
    }

    public static int first(int arr[],int key,int i){
        //base case
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return first(arr, key, i+1);
    }
}

}
