public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        int p =2;
        while (p * p <=n) {
            if (isPrime[p]) {
                int multiple = 2 * p;
                while (multiple <= n) {
                    isPrime[multiple] = false;
                    multiple += p;
                }
            }
          p++;  
        }
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }
        int T = n - 1;
        int P = 100 * count / n;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + P + "% are primes)");
    }
}