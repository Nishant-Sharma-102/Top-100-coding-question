

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

    public static int removeDuplicate(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;

            }
        }
        return i + 1;
    }

    public static void addInBig(int arr[], int key, int n) {
        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = key;
    }

    public static void addInLast(int arr[], int key, int n) {
        arr[n] = key;
    }

    public static void addAtPos(int arr[], int key, int pos, int n) {
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = key;
    }

    public static void repeatElement(int arr[]) {
        int cnt = 0;
        int dup[] = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j])
                    dup[cnt++] = arr[i];

            }
        }
        System.out.println("repeating element are ");
        for (int i = 0; i <= cnt; i++) {
            if (dup[i] != dup[i + 1]) {
                System.out.print(dup[i] + " ");

            }
        }
    }

    public static void findNonRepeat(int arr[]) {
        boolean chk;
        for (int i = 0; i < arr.length; i++) {
            chk = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    chk = true;

                }
            }
            if (!chk)
                System.out.println(arr[i] + " ");
        }
    }

    public static void symmetRicPair(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
                    System.out.print("(" + arr[i][1] + "," + arr[i][0] + ")");
                    break;
                }
            }
        }
    }

    public static int product(int arr[]) {
        int prod = 1;
        for (int i = 1; i < arr.length; i++) {
            prod *= i;
        }
        return prod;
    }

    public static void printFreq(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 0;
            if (x == -1)
                continue;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == x) {
                    count++;
                    arr[j] = -1;

                }
            }
            System.out.println("frequncy of " + x + " is " + count);
        }
    }

    public static int findEquilibrium(int arr[]) {
        int totsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totsum += arr[i];
        }
        int leftsum = 0, rightsum = totsum;
        for (int i = 0; i < arr.length; i++) {
            rightsum -= arr[i];
            if (leftsum == rightsum) {
                return i;
            }

            leftsum += arr[i];
        }
        return -1;
    }

    public static boolean arraySubset(int arr1[], int arr2[], int m, int n) {
        if (m > n) {
            return false;

        }
        for (int i = 0; i < arr1.length; i++) {
            boolean present = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i]) {
                    present = true;
                    break;
                }
            }
            if (present == false)
                return false;
        }
        return true;
    }

    // Problems on Numbers

    public static boolean checkPallindrone(int n) {
        int m = n;
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;

        }
        if (m == rev) {
            return true;

        } else {
            return false;
        }

    }

    public static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;

                if (n / i != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static void perfectNumber(int n) {
        int sum = 0;
        int m = n;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == m) {
            System.out.println("the number is perfect");
        } else {
            System.out.println("sorry this is not the perfect number");
        }

    }

    public static void evenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.print("The number is even");
        } else {
            System.out.print("The Number Is odd");
        }
    }

    public static void postiveOrNegative(int n) {
        if (n > 0) {
            System.out.println("The number is positive");

        } else {
            System.out.println("The number is negetive");

        }
    }

    public static float apSum(float a, float d, int n) {
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += a;
            a += d;
        }
        return sum;
    }

    public static float gpSum(float a, float r, int n) {
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a;
            a *= r;
        }
        return sum;
    }

    public static void greatestOfThree(int a, int b, int c) {
        if (a < b && c < b) {
            System.out.println(" greatest " + b);

        } else if (b < c && a < c) {
            System.out.println("greatest " + c);

        } else {
            System.out.println("greatest " + a);
        }
    }

    public static void leapYear(int n) {
        if (n % 4 == 0 || n % 400 == 0 || n % 100 == 0) {
            System.out.println("The year is leap year");

        } else {
            System.out.println("No leap year");
        }
    }

    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n / 10;

        }
        return reverse;

    }

    public static int largestDigit(int n) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            max = Math.max(max, lastdigit);
            n = n / 10;
        }
        return max;
    }

    public static int smallDigit(int n) {
        int small = Integer.MAX_VALUE;
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            small = Math.min(small, lastdigit);
            n = n / 10;
        }
        return small;
    }

    public static void fibbonaci(int n) {
        // USING RECURRSION
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    public static int factorial(int n) {
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul *= i;
        }
        return mul;
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (n % 2 == 0) {
            double half = power(x, n / 2);
            return half * half;
        } else {
            double half = power(x, n / 2);
            return x * half * half;
        }

    }

    public static void factorialNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.print(i + " ");

            }
        }
        System.out.println(sum);
    }

    public static void factorialNumberPrimeNumber(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {

            }

            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int strongNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            sum += factorial(lastdigit);
            n = n / 10;

        }
        return sum;
    }

    public static boolean automorphicNumber(int n) {
        int sq = n * n;
        while (n > 0) {
            if (n % 10 != sq % 10) {
                return false;
            }
            n = n / 10;
            sq = sq / 10;

        }
        return true;
    }

    public static void equililateralAlgoOrGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            System.out.println("the gcd is => " + b);
        } else {
            System.out.println("the gcd is => " + a);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void harshadNumber(int n) {
        int sum = 0;
        int original = n;
        while (n > 0) {
            int lastdigit = n % 10;
            sum += lastdigit;
            n = n / 10;

        }
        if (original % sum == 0) {
            System.out.println("this is a harshad number => ");

        } else {
            System.out.println("this is not harshad number");
        }
    }

    public static int suminRange(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static int gcdd(int a, int b) {
        if (b == 0) {
          return a;
        }
        return gcdd(b, a % b);
    }

    public static void simple(int num3, int den3) {
        int gcd = gcdd(num3, den3);
        num3 /= gcd;
        den3 /= gcd;
    }

    public static int replaceWithXero(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 0, temp = 1;
        while (n > 0) {
            int lastdigit = n % 10;
            if (lastdigit == 0) {
                lastdigit = 1;
            }
            ans = lastdigit * temp + ans;
            n = n / 10;
            temp = temp * 10;
        }
        return ans;
    }

    public static void givenNumberIsPrime(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
                sum += i;

            }
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void selectioSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }

            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = i;
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = arr[curr];
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1);
        quickSort(arr, pidx + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;

        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, mid, si, ei);
    }

    public static void merge(int arr[], int mid, int si, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;

        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " , " + j);
                }
            }
        }
    }

    // Problem on Stringg

    public static boolean checkPallindronee(int i, String str) {
        if (i >= str.length() / 2)
            return true;

        if (str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;

        return checkPallindronee(i + 1, str);

    }

    public static boolean chekPallinINString(String str){
        int left= 0;
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

    public static void countvcwhiteSpace(String str) {
        int vowel = 0;
        int consonent = 0;
        int whiteSpace = 0;
        String strr = str.toLowerCase();
        for (int i = 0; i <= strr.length() - 1; i++) {
            char ch = strr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else if (ch == ' ') {
                whiteSpace++;
            } else {
                consonent++;
            }

        }
        System.out.println("vowelse are in string => " + vowel + " white spaces are => " + whiteSpace
                + "  consonent are =>" + consonent);
    }

    public static void findAsciiValue(char ch) {
        ch = 'A';
        int ascii = ch;
        System.out.println("The ascii value of this char is = > " + ascii);
    }

    public static void removeVowels(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            System.out.print(ch);
        }
        // return str;

    }

    public static void removeSpaces(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            System.out.print(ch);
        }
        // return str;

    }

    // IMPORTANT NOTE --> in beetwen 65 to 90 all in upperletter
    // and in between 97 to 122 all lowercase letter comes in;

    public static String removeCharacter(String str) {
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);
            if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();

    }

    public static String swap(String str, int i, int j) {
        StringBuilder s = new StringBuilder(str);
        s.setCharAt(i, str.charAt(j));
        s.setCharAt(j, str.charAt(i));
        return s.toString();
    }

    public static int sumOfNumberInString(String str) {
        String tempsum = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (Character.isDigit(s)) {
                tempsum += s;
            } else {
                sum += Integer.parseInt(tempsum);
                tempsum = "0";
            }
        }
        return sum + Integer.parseInt(tempsum);
    }

    public static String capsFirstAndLast(String str, int size) {
        StringBuffer sb = new StringBuffer(str);
        for(int i=0; i<size; i++){
            if(i==0 || i==(size-1)){
                sb.setCharAt(i, Character.toUpperCase((char)(int)str.charAt(i)));
            }else if (str.charAt(i)==' ') {
                sb.setCharAt((i-1), Character.toUpperCase((char)(int)str.charAt(i-1)));
                sb.setCharAt((i+1), Character.toUpperCase((char)(int)str.charAt(i+1)));
            }
        }
        return sb.toString();
    }

    public static void calculateFrequency(String str){
        int freq[] = new int[26];
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if (freq[i]!=0) {
                System.out.print((char)(i+'a'));
                System.out.print(freq[i]+" ");
            }
        }
    }
    public static int findNonRepeatt(String str){
        int freq[] = new int[26];
        char[] chars = str.toCharArray();
        for(char c:chars){
            freq[c-'a']++;

        }
        for(int i=0;i<chars.length; i++){
            if (freq[chars[i]-'a']==1) {
             return i;
                
            }
        }
       return -1;

       
    }
    public static void findNonRepeattt(String str){
        int freq[] = new int[200];
        char[] c = str.toCharArray();
        for(int i=0; i<str.length(); i++){
             freq[i] = 1;
             for(int j= i+1; j<str.length(); j++){
                if (c[i]==c[j]) {
                    freq[i]++;
                    c[j] = '-';
                }
             }
        }
        for(int i=0; i<str.length(); i++){
            if (freq[i]==1 && c[i]!='-' && c[i]!=' ') {
                System.out.println(c[i]+" ");
                
            }
        }
        
    }

    //This is final and best method to find non repeat element int String
    public static void findNonRepeatttT(String str){
        int freq[] = new int[200];
        char s[] = str.toCharArray();
        for(int i=0; i<str.length(); i++){
              if (str.charAt(i)==' ') {
                continue;
                
              }
              else freq[(int)str.charAt(i)]++;
        }
        for(int i= 0; i<str.length(); i++){
            if (freq[(int)str.charAt(i)]==1 && s[i]!=' ') {
                System.out.println(s[i]+" ");
            }
        }
    }
// find maximum occurence char in String

public static char maxOccurInString(String str){
    int freq [] = new int[256];
    for(int  i=0;i<str.length(); i++){
        freq[str.charAt(i)]++;
    }
    int max = -1;
    char c = ' ';
    for(int i  = 0; i<str.length(); i++){
        if (max<freq[str.charAt(i)]) {
            max = freq[str.charAt(i)];
            c = str.charAt(i);
        }
    }
    return c;
}
//This is best and final method

public static char maxoccuernecee(String str){
   int count[] = new int[256];
   int max= -1;
   char maxcar = '0';
   for(int i=0; i<str.length(); i++){
    count[str.charAt(i)]++;

   }
   for(int i=0; i<256; i++){
    if (count[i]>max) {
        max = count[i];
        maxcar = (char)i;
        
    }
   }
   return maxcar;
}
public static String removeAllDuplicate(String str){
      String ans = " ";
      for(int i =0;i<str.length(); i++){
        int j= 0;
        for( j= 0; j<i;  j++){
            if (str.charAt(i)==str.charAt(j)) {
                break;
            }
        }
        if (i==j) {
            ans+=str.charAt(i);
        }
      }
      return ans;
}

public static void printAllDuplicate(String str){
    int count[] = new int[256];
    for(int i =0;i<str.length(); i++){
        count[str.charAt(i)]++;
    }
    for(int i= 0;i<256; i++){
        if (count[i]>1) {
          System.out.println((char)i+"count " +count[i]);
            
        }
    }
}
public static void changeeveryletterbyone(String str){
    String result = " ";
    char ch;
    for(int i= 0; i<str.length(); i++){
        ch = str.charAt(i);
        result = result+ (char)(((int)ch)+1);
    }
    System.out.println(result);
}

public static String removecharfromfirst(String str , String ptr){
    String  result = " ";
    for(int i =0; i<str.length(); i++){
        int count = 0;
        for(int j = 0; j<ptr.length(); j++){
            if (str.charAt(i)==ptr.charAt(j)) {
                count++;
                
            }
        }
        if (count!=1) {
            result+=str.charAt(i);
        }
    }
    return result;
}

// Sort String imp question

public static String sortingChar(String str){
    char[]  arr = str.toCharArray();
    for(int i= 0; i<str.length()-1; i++){
        for(int j = 0; j<str.length()-i-1; j++){
            if (arr[j]>arr[j+1]) {
                char temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                
            }
        }
    }
    String ans = new String(arr);
    return ans;
}

public static int countWords(String str){
    int count = 1;
    for(int i= 0;i<str.length(); i++){
        if (str.charAt(i)==' ') {
            count++;
        }
       
        
    }
    return count;
}
public static String changeCase(String str){
    StringBuffer ans = new StringBuffer();
    for(int  i= 0; i<str.length(); i++){
        int ascii = (int)str.charAt(i);

        if (ascii>=65 && ascii<=90) 
            ans.append((char)(ascii+32));
            
         else if (ascii>=97 && ascii<=122) 
            ans.append((char)(ascii-32));

        else if (str.charAt(i)==' ') 
            ans.append(' ');
        
    }
    return ans.toString();
}
public static void stringCOncat(String str, String ptr){
    System.out.println(str+ptr);
}

public static int PositionSubstring(String str, String ptr){
    for(int i= 0; i<str.length();i++){
        int temp = i;
        int j=0;
        for(j=0; j<ptr.length(); j++){
            if (str.charAt(temp)!=ptr.charAt(j)) {
                break;
            }
            temp++;
        }
        if (j==ptr.length()) {
           return i; 
        }
    }
    return -1;

}
public static String reveseString(String str){
    String[] word = str.split(" ");
    StringBuilder sb = new StringBuilder();
    for(int i=word.length-1; i>=0; i--){
        sb.append(word[i]);
        sb.append(' ');
    }
    return sb.toString().trim();
}

public static String reverChar(String str){
    char[] ch = str.toCharArray();
    int left = 0;
    int right = ch.length-1;
    while (left<right) {
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
        left++;
        right--;
        
    }
    return  new String(ch);
}

public static int kadaneAlgo(int arr[]){
    int sum = 0; 
    int maxi = arr[0];
    for(int i=0; i<arr.length; i++){
        sum+=arr[i];
        maxi = Math.max(maxi, sum);
        if (sum<0) {
            sum = 0;
        }
    }
    return maxi;
}
    public static void main(String[] args) {
       int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
       System.out.println(kadaneAlgo(arr));
      //  System.out.println(reveseString(str));
    //    String str = "takeuforward";
    //    String ptr = "forward";
    //    System.out.println(PositionSubstring(str,ptr));
    // stringCOncat(str, ptr);
      //System.out.println(changeCase(str));
        //System.out.println(countWords(str));
        //System.out.println(sortingChar(str));
    //     String str = "xyzpw";
    //    String ptr = "lmno";
    //     System.out.println(removecharfromfirst(str, ptr));
      //  System.out.println(maxoccuernecee(str));
        //changeeveryletterbyone(str);
    // printAllDuplicate(str);
       // System.out.println(removeAllDuplicate(str));
       // System.out.println(maxOccurInString(str));
        //findNonRepeatttT(str);
        // int size = str.length();
        // System.out.println(findNonRepeatt(str));
        //calculateFrequency(str);
       // System.out.println(capsFirstAndLast(str, size));
       // System.out.println(sumOfNumberInString(str));
        // String str = "Nishant Sharma";
        // int i =0;
        // int j = str.length()-1;
        // while (i<j) {
        // str = swap(str, i, j);
        // i++;
        // j--;

        // }
        // System.out.println(str);
    }

}

// removeVowels(str);
// removeSpaces(str);
// String str = "India won the cricket match";
// countvcwhiteSpace(str);
// int nums[] = {3,4,5,6};
// int target = 7;
// twoSum(nums, target);

// int arr[] = {13,46,24,52,20,9};
// mergeSort(arr, 0, arr.length-1);
// //quickSort(arr, 0, arr.length-1);
// //insertionSort(arr);
// // selectioSort(arr);
// for(int i =0; i<arr.length; i++){
// System.out.print(arr[i]+" ");
// }
// int n = 74;
// givenNumberIsPrime(n);
// int num1 = 5, den1 = 2, num2 = 1, den2 = 2, num3, den3;

// int lcm = (den1*den2)/gcdd(den1, den2);
// den3 =lcm;
// num3 = num1*(den3/den1) + num2*(den3/den2);
// System.out.println(num3+"/"+den3);
// int a = 5;
// int b= 9;
// System.out.println(suminRange(a, b));
// int a = 20;
// int b = 15;
// int ans = gcd(a, b);
// int lcm = (a * b) / ans;
// System.out.println(lcm);
// int n = 66;
// System.out.println(automorphicNumber(n));
// int ans = strongNumber(n);
// if (n == ans && n!=0) {
// System.out.println("is a Strong Number ");

// }else{
// System.out.println("it is not strong number");
// }

// System.out.println(power(2, 5));

// System.out.println(factorial(n));
// fibbonaci(n);
// System.out.println(fibbonaci(n));
// System.out.println(smallDigit(n));
// System.out.println(reverseNumber(n));
// leapYear(n);
// int a = 17, b =3, c= 5;
// greatestOfThree(a, b, c);
// float a =2;
// float r = 1.5f;
// int n = 4;
// System.out.println(gpSum(a, r, n));
// System.out.println(apSum(a, d, n));
// postiveOrNegative(n);
// evenOrOdd(n);
// perfectNumber(n);
// int min = 10;
// int max = 20;
// for(int i= min; i<max; i++){
// if (checkPrime(i)) {
// System.out.print(i+" ");

// }
// }
// System.out.println(checkPrime(n));
// int min = 10;
// int max= 100;
// for(int i = min; i<max; i++){
// if (checkPallindrone(i)) {
// System.out.print(i+" ");
// }
// }
// int arr1[]={1,3,4,5,2};
// int arr2[]={2,4,3,1,7,5,15};
// int m = arr1.length;
// int n = arr2.length;
// boolean ans = arraySubset(arr1, arr2, m, n);
// if (ans==true) {
// System.out.println("arry is subset of another array");

// }else{
// System.out.println("array is not subset of another array");
// }
// int arr[] = {1,2,3,2,3,1,3,5,6};
// printFreq(arr);
// System.out.println(product(arr));
// symmetRicPair(arr);
// findNonRepeat(arr);
// repeatElement(arr);
// int key = 6;
// int pos = 4;
// int n = 5;
// addInBig(arr, key, n);
// addInLast(arr, key, n);
// addAtPos(arr, key, pos, n);

// for(int i = 0; i<arr.length; i++){
// System.out.print(arr[i]+" ");
// }
// System.out.println();
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
