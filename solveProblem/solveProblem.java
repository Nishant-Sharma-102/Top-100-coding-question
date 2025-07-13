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

    public static void harshadNumber(int n){
        int sum = 0;
        int original = n;
        while (n>0) {
            int  lastdigit = n%10;
            sum+=lastdigit;
            n= n/10;
            
        }
        if (original%sum==0) {
            System.out.println("this is a harshad number => ");
            
        }else{
            System.out.println("this is not harshad number");
        }
    }

    public static void main(String[] args) {
        int n = 378;
        harshadNumber(n);
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

    }
}