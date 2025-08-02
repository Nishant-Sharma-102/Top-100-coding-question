import java.util.*;
public class cognizantIMPQues {

    public static int minimumProductSum(int arr1[], int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int res= 0;
        for(int i=0, j =arr2.length-1; i<arr1.length; i++, j--){
          res +=arr1[i]*arr2[j];
     }
      return res;
    }

    public static int countMagicalRows(int arr[][]){
        int count =0;
        for(int i=0; i<arr.length; i++){
            int oddsum=0;
            boolean hasodd = false;
            for(int j= 0; j<arr[0].length; j++){
                if (arr[i][j]%2!=0) {
                    oddsum +=arr[i][j];
                    hasodd = true;
                }
            }
            if (hasodd && oddsum % 2==0) {
                count++;
            }
        }
        return count;
        
    }
    public static int maxBookRead(int arr[],int n){
        int sum = 0;
        int count =0;
        Arrays.sort(arr);
       
        for(int i=0; i<arr.length; i++){
            if (sum+arr[i]<=n) {
                sum+=arr[i];
            count++;
            } 
        }
        return count;
    }

    public static int redPenGreenPen(int arr[]){
        int count =0;
        for(int i=1; i<arr.length; i++){
            if (arr[i-1]%2!=0 && arr[i]%2==0) {
                count++;
            }
        }
        return count;
    }

    //Library Explotion
    
    public static boolean getPrime(int n){
   if (n<=1) {
    return false;
   }
    for(int i=2;  i*i<=n; i++){
       if (n%i==0) {
        return false;
       }
    }
    return true;
    }

    public static int maxBooks(int nums[],int N, int k){
        int totalsum =0;
        for(int i = 1; i<=N; i++){
            if (getPrime(i)) {
                totalsum+=Math.min(k, nums[i-1]);
            }
        }
        return totalsum;
    }
        public static void main(String[] args) {
            int nums[] = {3,7,5,6};
            int k = 5;
            int N=4;
            System.out.println(maxBooks(nums,N, k));
        //   int arr[]=  {70,23,13,26,72,19};
        //   System.out.println(redPenGreenPen(arr));
            // int arr[] = {2,2,2,2,2};
            // int n =6;
            // System.out.println(maxBookRead(arr, n));
        //     int arr[][] = {{1,2,3},
        //                    {4,5,6},
        //                    {7,8,9}};
    
        // System.out.println(countMagicalRows(arr));
        // int arr1[] = {1,4,1,6};
        // int arr2[] = {1,4,3,4};
        // System.out.println(minimumProductSum(arr1, arr2));
    }
}
