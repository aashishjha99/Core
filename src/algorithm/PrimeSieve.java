package algorithm;

public class PrimeSieve {

  static void sieve(int n) {

    Boolean[] isPrime = new Boolean[n + 1];

    for (int j = 0; j <= n; j++) {
      isPrime[j] = true;
    }

    for (int j = 2; j * j <= n; j++) {
      if (Boolean.TRUE.equals(isPrime[j])) {
        for (int i = j * j; i <= n; i +=j) {
          isPrime[i] = false;
        }
      }
    }


    for(int i = 0 ;i <=n ;i++){
        if(Boolean.TRUE.equals(isPrime[i])){
            System.out.println(i);
        }
    }

  }

  public static void main(String[] args) {
    PrimeSieve.sieve(20);
  }
}
