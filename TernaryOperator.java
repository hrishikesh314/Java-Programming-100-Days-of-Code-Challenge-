import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks= sc.nextInt();
        String RC=(marks>33)? "Pass":"fail";
        System.out.println(RC);
    }
}
