//this program is to print a prime no's upto user no.
public class PrintPrimeNo {
    public static boolean Isprime(int n){
        boolean Isprime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                Isprime= false;
                return Isprime; 
            }
        }
        return Isprime;

    }
    public static int PrimeRange(int n){
        for(int i=2;i<=n;i++){
            if(Isprime(i)){
                System.out.print(i+" ");
            }
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(PrimeRange(50));
    }
}
