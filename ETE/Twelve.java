import java.util.*;
public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr1=new int[a];
        int[] arr2=new int[b];
        int[] arr3=new int[c];

        //input in first array
        for(int i=0;i<a;i++){
            arr1[i] = sc.nextInt();
        }

        //input in second array
        for(int i=0;i<b;i++){
            arr2[i] = sc.nextInt();
        }

        //input in third array
        for(int i=0;i<c;i++){
            arr3[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
                for(int k=0;k<c;k++){
                    if (arr1[i]+arr2[j]+arr3[k]==target){
                        System.out.println("Triplet found: "+arr1[i]+","+arr2[j]+","+arr3[k]);
                    }
                }
            }
        }
    }
}
