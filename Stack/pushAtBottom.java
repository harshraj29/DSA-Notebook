import java.util.Stack;

public class pushAtBottom {
    public static void pushBottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushBottom(st, data);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        pushBottom(st,4);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
