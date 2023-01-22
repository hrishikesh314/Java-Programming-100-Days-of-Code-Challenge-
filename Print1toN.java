import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N Input");
        int n=sc.nextInt();
        int counter=1;
    
        while (counter<=n) {
            System.out.print(counter+"  ");
           counter++;
        }
    }
}
