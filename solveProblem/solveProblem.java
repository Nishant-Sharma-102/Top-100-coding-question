package solveProblem;

import java.util.*;

public class solveProblem {

    public static int findLargest(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        return max;
    }

    public static int findSmallest(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }

    public static int secoundLargest(int arr[]) {
        int largest = arr[0];
        int sslargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sslargest = largest;
                largest = arr[i];
            }

            else if (arr[i] > sslargest && arr[i] != largest) {
                sslargest = arr[i];
            }
        }
        return sslargest;

    }

    public static int secoundSmallest(int arr[]) {
        int smallest = arr[0];
        int ssmallest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];

            } else if (arr[i] < ssmallest && arr[i] != smallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;

    }

    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void countFreq(int arr[]) {
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == true) {
                continue;

            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;

                }
            }
            System.out.println(arr[i] + " " + count);
        }

    }

    public static void reArrange(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int calculateSum(int arr[]){
        int sum= 0;
        for(int i= 0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;

    }
   // right rotation by k elements

    public static void rotatedArrByKelement(int arr[], int start, int end){
        while (start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            
        }
        
    }
    public static void rotates(int arr[], int k,int start, int end){
       
        int n= arr.length;
        k = k%n;
        rotatedArrByKelement(arr, 0, n-1);
       rotatedArrByKelement(arr,0, k-1);
        rotatedArrByKelement(arr, k, n-1);
    }
    public static void leftRotation(int arr[],int k, int start, int end){
        int n = arr.length;
        k = k%n;
        rotatedArrByKelement(arr, 0, k-1);
        rotatedArrByKelement(arr, k, n-1);
        rotatedArrByKelement(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        int k= 1;
       // leftRotation(arr, 2, 0, arr.length-1);
        rotates(arr, 2, 0, 0);
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //System.out.println(calculateSum(arr));
       // reArrange(arr);
        // int arr[] = {10,10,2,2,3,3,4,5,5,5};
        // countFreq(arr);
        // int arr[] = {5,4,3,2,1,0};
        // reverseArray(arr);
        // for(int i= 0; i<arr.length; i++){
        // System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println("secound smallest = "+ secoundSmallest(arr));
        // System.out.println(secoundLargest(arr));

    }
}