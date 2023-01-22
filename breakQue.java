import java.util.Scanner;

public class breakQue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do{
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true)

    }
}
