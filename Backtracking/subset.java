import java.util.*;

public class subset {
    public static void findSubset(String str,String ans,int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }

        //recursion
        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);

        //No choice
        findSubset(str, ans, i+1);

    }
    public static void main(String[] args) {
        String abc = "Harsh";
        findSubset(abc, "", 0);
    }
}
