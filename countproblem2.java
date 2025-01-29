public class countproblem2 {

    
    public static int countP(int l, int r) {
        int[] primes = new int[r + 1];


        for (int i = 0; i <= r; i++) {
            primes[i] = 1;
        }

        
        primes[0] = primes[1] = 0;

        
        for (int i = 2; i * i <= r; i++) {
            if (primes[i] == 1) {
                for (int j = i * i; j <= r; j += i) { 
                    primes[j] = 0; 
                }
            }
        }

        
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (primes[i] == 1) {
                count++;
            }
        }
        return count;
    }

   
    public static void main(String[] args) {
        int l = 10;
        int r = 50;

        int primeCount = countP(l, r);
        System.out.println( l +  r  + primeCount);
    }
}
