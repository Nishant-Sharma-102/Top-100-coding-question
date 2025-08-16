import java.util.*;
public class cognizantImp {
    public static int minimumProductSum(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int res = 0;
        for (int i = 0, j = arr2.length - 1; i < arr1.length; i++, j--) {
            res += arr1[i] * arr2[j];
        }
        return res;
    }
    public static int countMagicalRows(int arr[][]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int oddsum = 0;
            boolean hasodd = false;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    oddsum += arr[i][j];
                    hasodd = true;
                }
            }
            if (hasodd && oddsum % 2 == 0) {
                count++;
            }
        }
        return count;

    }

    public static int maxBookRead(int arr[], int n) {
        int sum = 0;
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= n) {
                sum += arr[i];
                count++;
            }
        }
        return count;
    }

    public static int redPenGreenPen(int arr[]) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] % 2 != 0 && arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Library Explotion

    public static boolean getPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int maxBooks(int nums[], int N, int k) {
        int totalsum = 0;
        for (int i = 1; i <= N; i++) {
            if (getPrime(i)) {
                totalsum += Math.min(k, nums[i - 1]);
            }
        }
        return totalsum;
    }

    public static String decrypt(String str) {
        String result = " ";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            result += (char) (((int) ch) - 1);

        }
        return result;
    }

    public static String sortString(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);

        String ans = new String(arr);
        return ans;
    }

    public static int findEvenOrOdd(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 || arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static int discountSum(int arr[], int n) {
        int sum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;

        // Step 1: Sort array in descending order (manual selection sort)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Step 2: Pick first n unique elements
        int last = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != last) {
                if (count == 0) {
                    max = arr[i]; // store the largest
                }
                sum += arr[i];
                last = arr[i];
                count++;
            }
            if (count == n) {
                break;
            }
        }

        // Step 3: If not enough unique values
        if (count < n) {
            return 0;
        }

        // Step 4: Apply discount
        return sum - max;
    }

    public static int discountedSum(int arr[], int n) {
        int sum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        Arrays.sort(arr);
        int last = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != last) {
                if (count == 0) {
                    max = arr[i];

                }
                sum += arr[i];
                last = arr[i];
                count++;
            }
            if (count == n) {
                break;
            }

        }
        if (count < n) {
            return 0;
        }
        return sum - max;
    }

    public static void movieBill() {
        int totalPrice = 0;
        System.out.println("Enter the movie shopping");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of  pizza");
        int pizza = sc.nextInt();
        pizza = 100 * pizza;
        System.out.println("enter no. of puffs");
        int puffs = sc.nextInt();
        puffs = 20 * puffs;

        System.out.println(" enter cool no. of drinks");
        int colddrinks = sc.nextInt();
        colddrinks = 10 * colddrinks;
        totalPrice += pizza + puffs + colddrinks;

        System.out.println("total price is = " + totalPrice);

    }

    public static String checkPallindrone(int num) {
        int reverse = 0;
        int original = num;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = 10 * reverse + lastDigit;
            num = num / 10;
        }
        if (reverse == original) {
            return "pallindrone";
        }
        return "Not pallindrone";
    }

    public static int sumPrimeFactor(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            while (getPrime(i) && n % i == 0) {
                sum += i;
                n /= i;
            }
        }
        return sum;
    }

    public static int findmidElement(int arr[]) {
        int temp[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > 0) {
                temp[count++] = arr[i];

            }
        }
        if (count == 0)
            return -1;
        int midindex = count / 2;
        return temp[midindex];

    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        str = str.trim();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }

        }
        return count;
    }
    public static int secoundLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for(int i= 0; i<arr.length; i++){
            if (arr[i]>largest) {
                slargest = largest;
                 largest = arr[i];
            }else if (arr[i]>slargest && arr[i]!=largest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static void mergedSortetwoarray(int arr1[], int n, int arr2[], int m, int arr3[] ){
        int i=0, j=0;
        int k = 0;
        while (i<n && j<m) {
            if (arr1[i]<arr2[j]) {
                arr3[k++] = arr1[i++];
               
            }else{
                arr3[k++] = arr2[j++];
                
            }

            
        }
        while (i<n) {
            arr3[k++] = arr1[i++];
        }while (j<m) {
             arr3[k++] = arr2[j++];
        }
    }

    public static int reverse(int num){
        int rev = 0;
        while (num>0) {
            int lastDigit = num%10;
            rev = rev*10+lastDigit;
            num = num/10;
        }
        return rev;

    }
    public static int countVowels(String str){
        int count =0;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
        }
        return count;
    }

    public static int Gcd(int a, int b){
      if (b==0) {
        return a;
      }
    return Gcd(b, a%b);
    }

    public static void gcdd(int a, int b){
        while (a>0 && b>0) {
            if (a>b) {
                a = a%b;
                
            }else{
                b = b%a;
            }
            if (a==0) {
                System.out.println(b);
            }else{
                System.out.println(a);
            }
        }
    }
   public static int LCM(int a, int b){
    return (a*b)/Gcd(a, b);
   }

   public static int fibbonaci(int num){
    if (num==0 || num==1) {
        return num;
    }
    return fibbonaci(num-1)+fibbonaci(num-2);
   }

   public static void bubbleSortt(int arr[]){
    for(int i=0;i<arr.length-1; i++){
        for(int j=0;j<arr.length-1-i; j++){
            if (arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
   }

   public static int binarySearch(int arr[],int target){
    int left = 0;
    int right = arr.length-1;
    
    while (left<=right) {
        int mid = (left+right)/2;
        if (arr[mid]==target) {
           return mid;
        }else if (arr[mid]<target) {
            left = mid+1;
        }else{
            right = mid-1;
        }
        
    }
    return -1;
   }

   public static boolean chekPallinINString(String str){
    int left = 0;
    int right = str.length()-1;
    while (left<=right) {
        if (str.charAt(left)!=str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
        return true;
   }

public static String reveString(String str){
        String reverse = " ";
          for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
          }
          return reverse;
}

public static String ReverseSentences(String str){
    String[] word = str.split(" ");
    StringBuilder sb = new StringBuilder();
    for(int i=word.length-1; i>=0;i--){
         sb.append(word[i]);
         sb.append(' ');
    }
    return sb.toString().trim();
}
    public static void main(String[] args) {
        String str = "java is fun";
       // System.out.println(reveString(str));
        System.out.println(ReverseSentences(str));
        //System.out.println(chekPallinINString(str));
        // int[] arr = {3, 8, 12, 17, 25, 31, 42, 56, 73, 91};
        // int target = 12;
        // binarySearch(arr, target);
        // bubbleSortt(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
    //    int a = 12;
    //    int b =18;
    //    System.out.println(LCM(a, b));
    //   System.out.println(Gcd(a, b));
        // int num = 1234;
        // System.out.println(reverse(num));
//         int arr1[] = {1,2,3};
//         int arr2[] = {4,5,6};
//         int n= arr1.length;
//         int m = arr2.length;
//         int arr3[] = new int[n + m];

//    mergedSortetwoarray(arr1, n, arr2, m, arr3);

//     for(int i =0; i<arr3.length; i++){
//         System.out.print(arr3[i]+" ");
//     }
}      
}
