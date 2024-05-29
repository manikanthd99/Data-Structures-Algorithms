import java.util.Scanner;


//Given an input array height[] representing the heights of buildings, write
//a program to count the number of buildings facing the sunset. It is
//assumed that the heights of all buildings are distinct.
//Examples
//Input: height[] = [7, 4, 8, 2, 9], Output: 3 Explanation: As 7 is the first
//element, it can see the sunset. Similarly, 8 and 9 can see the sunset. 4
//and 2 can't see the sunset because 7 and 8 are hiding it.
//Input: height[] = [2, 3, 4, 5], Output: 4

public class CountNoofBuildingtoSun {

    public static int function(int []arr){
        int size = arr.length;
        int temp = arr[0];
        int count = 1;
        for(int i=1;i<size;i++){
            if(arr[i]>temp) {
                count++;
                temp = arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of an array:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int res = function(arr);

        System.out.println("Result: "+res);

    }
}
