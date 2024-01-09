import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        
        for(int i =0;i<ch.length-1;i++){
            if(ch[i] != ch[i+1]){
                System.out.print(ch[i]);
            }
        }

        System.out.print(ch[ch.length-1]);
    }
}
