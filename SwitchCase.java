import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        switch (number)
         {
            case 1: System.out.println("Samosa");
                
                break;
                case 2:System.out.println("Jalebi");
                break;
                case 3:System.out.println("Chinese food");
                break;
        
            default: System.out.println("you are dreaming 😂");
                break;
        }
    }
}
