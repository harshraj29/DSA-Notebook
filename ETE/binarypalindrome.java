import java.util.ArrayList;
import java.util.List;

public class binarypalindrome {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        for(int i = 1 ; i <1000 ; i++)
        {
                String bin = Integer.toBinaryString(i);
                StringBuilder sb = new StringBuilder(bin);

                if(bin.equals(sb.reverse().toString()))
                {
                        arr.add(i);
                }
                
        }

        System.out.print(arr.get(3-1));
    }
}
