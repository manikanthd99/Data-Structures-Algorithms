
import java.util.Scanner;


//Given an array X of n integers, write a program to check if the array is a
//valid mountain array or not.
//The array X is a mountain array if and only if n >= 3 and there exists
//some i (0 < i < n -1) such that: X[0] < X[1] <...< X[i-1] < X[i] and X[i] >
//X[i+1] > ...> X[n-1]. In other words, the array is a valid mountain when it
//is first strictly increasing and then strictly decreasing.
public class Mountain {

    public static boolean function(int[] arr){
        int size = arr.length;
        int left, right;
        for(left =0;left<size && arr[left] < arr[left+1]; left++);
        for(right=size-1;right>0 && arr[right]<arr[right-1] ; right--);
        if(left == right && left > 0 && right < size - 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Elements of an array:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("IsMountain:"+function(arr));
    }
}
