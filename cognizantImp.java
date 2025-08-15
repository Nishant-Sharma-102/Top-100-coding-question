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
   
}
