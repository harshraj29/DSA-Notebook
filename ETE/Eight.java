import java.util.*;
public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = 0;
        while (true) {
            n = sc.nextInt();
            if (n == -1) {
                break;
            }
            list.add(n);
        }

        int num = sc.nextInt();
        int cnt = 0;
        for(int i = list.size()-1;i>=0;i--){
            if(list.get(i) == num){
                break;
            }
            cnt++;
        }

        System.out.print(cnt+1);
    }
}
