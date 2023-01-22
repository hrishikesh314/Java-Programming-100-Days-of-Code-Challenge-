import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
           Scanner sc =new Scanner(System.in);
           System.out.println("Enter The Input Value");
           int input=sc.nextInt();
           int i=1;
           while (i<=input) {
            System.out.println("Hello World");
            // i++;
           }
    }
}
