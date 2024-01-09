import java.util.*;
class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            ll.addFirst(sc.nextInt());
        }
        
        System.out.print(ll);
    }
}
