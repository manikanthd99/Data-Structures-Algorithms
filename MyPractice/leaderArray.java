import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Given an integer array X[] of size n, write a program to find all the
//leaders in the array X[]. An element is a leader if it is strictly greater than
//all the elements to its right side.
//The last element of an array is a leader by default.
//The largest element of an array is also a leader by default.
//Suppose all the array elements are unique.
//Ordering in the output doesn’t matter.

public class leaderArray {

    public static List<Integer> function(int [] arr){
        int n= arr.length;
        int max = arr[n-1];
        List<Integer> temp = new ArrayList<>();
        temp.add(max);
        for(int i=n-2; i>=0; i--){
            if(arr[i]> max){
                temp.add(arr[i]);
                max = arr[i];
            }
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> res = function(arr);

        System.out.println("Result: " + res);
    }
}
