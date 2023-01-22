import java.rmi.server.RemoteRef;

public class LargestNoInArray {
    public static int large(int numbers[]) {
        int l=Integer.MIN_VALUE;
        int s=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
if(l<numbers[i])
{
    l=numbers[i];
}
        }
        return l;
    }
    public static void main(String[] args) {
        int n[]={1,3,6,2,55,32};
System.out.println("Highest No is :" + large(n));
    }
}
