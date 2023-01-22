import java.util.Scanner;

/**
 * SyntaxPyrameters
 */
public class SyntaxPyrameters {
    public static void SumOfTwo(int a, int b){
        int sum=a+b;
        System.out.println(" Sum of Two Nos is :" + sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();

        SumOfTwo(a, b);
    }
}