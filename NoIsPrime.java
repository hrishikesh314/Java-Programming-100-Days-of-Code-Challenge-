import java.util.Scanner;

public class NoIsPrime {
    private static final boolean Prime = false;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
          System.out.println("No is Prime");
          
        } 
        else{
            boolean Prime=true;
            for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
              Prime=false;
            }
        }
        if(Prime ==true){
            System.out.println("N is prime");
        }
            else{
                System.out.println("NO is not prime");
            }
        }

    }

}