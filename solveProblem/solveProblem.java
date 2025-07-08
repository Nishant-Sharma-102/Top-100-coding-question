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

    public static int calculateSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }
    // right rotation by k elements

    public static void rotatedArrByKelement(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }

    public static void rotates(int arr[], int k, int start, int end) {

        int n = arr.length;
        k = k % n;
        rotatedArrByKelement(arr, 0, n - 1);
        rotatedArrByKelement(arr, 0, k - 1);
        rotatedArrByKelement(arr, k, n - 1);
    }

    public static void leftRotation(int arr[], int k, int start, int end) {
        int n = arr.length;
        k = k % n;
        rotatedArrByKelement(arr, 0, k - 1);
        rotatedArrByKelement(arr, k, n - 1);
        rotatedArrByKelement(arr, 0, n - 1);
    }

    public static double average(int arr[]) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (double) arr[i];
            avg = (double) sum / arr.length;
        }
        return avg;
    }

    public static boolean checkArrIsSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {

            } else {
                return false;
            }
        }
        return true;
    }
    public static int  removeDuplicate(int arr[]){
        int i = 0;
        for(int j = 1; j<arr.length; j++){
            if (arr[j]!=arr[i]) {
                arr[i+1] = arr[j];
                i++;
                
            }
        }
        return i+1;
    }
    public static void addInBig(int arr[], int key, int n){
        for(int i=n-1; i>=0; i--){
         arr[i+1] = arr[i];
     }
     arr[0] = key;
    }

    public static void addInLast(int arr[], int key, int n){
        arr[n]  = key;
    }
    public static void addAtPos(int arr[], int key, int pos, int n){
        for(int i=n; i>=pos; i--){
         arr[i] = arr[i-1];
        }
        arr[pos-1]  = key;
    }

    public static void repeatElement(int arr[]){
        int cnt = 0;
        int dup[] = new int[arr.length];
        for(int i=0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]!=arr[j]) dup[cnt++] = arr[i];
                
            }
        }
        System.out.println("repeating element are ");
        for(int i = 0; i<=cnt; i++){
            if (dup[i]!=dup[i+1]) {
                System.out.print(dup[i]+" ");
                
            }
        }
    }

    public static void findNonRepeat(int arr[]){
        boolean chk;
        for(int i=0; i<arr.length; i++){
            chk = false;
            for(int j=0; j<arr.length; j++){
                if (i!=j && arr[i]==arr[j]) {
                  chk = true;
                    
                }
            }
            if (!chk) System.out.println(arr[i]+" ");
        }
    }
    public static void symmetRicPair(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[j][0]==arr[i][1] && arr[j][1]==arr[i][0]) {
                    System.out.print("("+arr[i][1]+","+ arr[i][0]+")");
                    break;
                }
            }
        }
    }
    public static int product(int arr[]){
        int prod = 1;
        for(int i =1; i<arr.length; i++){
            prod*=i;
        }
        return prod;
    }
    public static void printFreq(int arr[]){
        for(int i= 0; i<arr.length;  i++){
            int x = arr[i];
            int count = 0;
            if (x==-1) continue;
            for(int j= 0; j<arr.length; j++){
                if (arr[j]==x) {
                    count++;
                    arr[j]=-1;

                    
                }
            }
            System.out.println("frequncy of "+x +" is "+ count);
        }
    }

    public static int findEquilibrium(int arr[]){
        int totsum = 0;
        for(int i=0; i<arr.length; i++){
            totsum+=arr[i];
        }
        int leftsum = 0, rightsum =totsum;
        for(int i =0;i<arr.length; i++){
            rightsum-=arr[i];
            if (leftsum==rightsum) {
                return i;
        }
            
        leftsum+=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
            int arr[] = {2, 3, -1, 8, 4};
       System.out.println(findEquilibrium(arr));
        // int arr[] = {1,2,3,2,3,1,3,5,6};
        // printFreq(arr);
    //  System.out.println(product(arr));
      //symmetRicPair(arr);
       // findNonRepeat(arr);
        //repeatElement(arr);
        // int key = 6;
        // int pos = 4; 
        // int n = 5;
        //addInBig(arr, key, n);
       // addInLast(arr, key, n);
      // addAtPos(arr, key, pos, n);
  
    //    for(int i = 0; i<arr.length; i++){
    //     System.out.print(arr[i]+" ");
    //    }
    //    System.out.println();
        // System.out.println(checkArrIsSorted(arr));

        // System.out.println(average(arr));
        // int k= 1;
        // // leftRotation(arr, 2, 0, arr.length-1);
        // rotates(arr, 2, 0, 0);
        // for(int i= 0; i<arr.length; i++){
        // System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println(calculateSum(arr));
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