import java.util.*;
public class ReverseString {

    public static String reverseString(String str){
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            st.push(str.charAt(idx));
            idx++;
        }

        StringBuffer result = new StringBuffer("");
        while(!st.isEmpty()){
            char curr = st.pop();
            result.append(curr);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}
