import java.util.Scanner;

public class electronic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        // StringBuilder sb = new StringBuilder(name);
        
        for(int i=0; i<name.length(); i+=2){
            if(i+1<name.length()){
                // String pair = name.substring(i,i+2);
                char ch = name.charAt(i);
                char chh = name.charAt(i+1);
                String dh = Character.toString(ch);
                String dhh = Character.toString(chh);
                
                if(dh.compareTo(dhh)>0){
                    System.out.print(dh);
                }
                else{
                    System.out.print(dhh);
                }
                
            }
            
        }
        if(name.length()%2!=0){
            System.out.print(name.charAt(name.length()-1));
        }
    }
}
