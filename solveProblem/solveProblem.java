package solveProblem;
import java.util.*;
public class solveProblem {

    public static int findLargest(int arr[]){
        int max= arr[0];
        for(int i = 0;i<arr.length; i++){
            if (arr[i]>max) {
                max = arr[i];
                
            }
           
        }
        return max;
    }

    public static int findSmallest(int arr[]){
        int min = arr[0];
        for(int i =0; i<arr.length; i++){
            if (arr[i]<min) {
                min = arr[i];
                
            }
        }
        return min;
    }
    public static void main(String[] args) {
    int  arr[] = {2,5,1,3,0};
    System.out.println(findSmallest(arr));
    System.out.println(findLargest(arr));
    } 
}