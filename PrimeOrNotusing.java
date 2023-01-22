import java.util.Scanner;

public class PrimeOrNotusing {
    public static boolean Isprime(int n){
        boolean Isprime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                Isprime= false;
            }
        }
        return Isprime;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n=sc.nextInt();

        System.out.println(Isprime(n));
    }
}
