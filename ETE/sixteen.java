import java.util.*;
public class sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int k = 1 ;
        while(count < n){
            int housenumber = 3*k+2;
            if(housenumber % m != 0){
                list.add(housenumber);
                count++;
            }
            k++;
        }

        System.out.println(list);

    }
}
