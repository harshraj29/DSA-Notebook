import java.util.Scanner;

public class delete00or10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target1 = "00";
        String target2 = "10";
        StringBuilder sb = new StringBuilder(str);
        
        for(int i=0; i<sb.length(); i++){
            if(i+2<sb.length()){
                String pair = sb.substring(i , i+2);
                if(pair.equals(target1)||pair.equals(target2)){
                    sb.delete(i , i+2);
                }
                
            }
        }
        
        System.out.print(sb.length());
    }
}
