public class abc{
    public static void main(String[] args) {
        int n=100;
        sieve(n);
    }
    
    public static void sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }
        isPrime[0]=isPrime[1]=false;
        for(int p=2;p*p<=n;p++){
            if(isPrime[p]){
                for(int i=p*p;i<=n;i+=p){
                    isPrime[i]=false;
                }
            }
        }
        System.out.println("Prime Number upto :"+n+" :");
        for(int i=2; i<n;i++){
            if (isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }    
    
}