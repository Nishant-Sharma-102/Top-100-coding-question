import java.util.*;
public class wiproImpQues {
    public static int isPrime(int num){
        if (num<2) return 0;
        for(int i=2; i<=Math.sqrt(num); i++){
            if (num%i==0) return 0;
                
            
        }
            return 1;
        
    }

     public static int nthPrime(int N){
        int count =0;
        int num =1;
        while (count<N) {
            num++;
            if (isPrime(num)==1) {
                count++;
            }
            
        }
        return num;
    }
public static int countNumbers(int a, int b, int c, int d, int e, String type) {
    int[] numbers = { a, b, c, d, e };
    int count = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (type.equalsIgnoreCase("even") && numbers[i] % 2 == 0) {
        count++;
      } else if (type.equalsIgnoreCase("odd") && numbers[i] % 2 != 0) {
        count++;
      }
    }

    return count;
  }

  public static int nexactmltiple(int n, int m) {
    if (n == 0 || m == 0) {
      return 3;
    }
    if (n % m == 0) {
      return 2;
    } else {
      return 1;
    }
  }
   public static boolean isPrimee(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
   public static int primeInRange(int N){
    int count =0;
    int sum = 0;
    for(int i = 2; i<=N; i++){
        if (isPrimee(i)) {
            sum+=i;
            count++;
            System.out.println(" the prime numbers are "+i);
        }
    }
    return sum;
   }
    public static void main(String[] args) {
      int N = 10;
      System.out.println(primeInRange(N));  
    }

}
