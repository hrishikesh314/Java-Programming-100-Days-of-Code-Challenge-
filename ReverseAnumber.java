public class ReverseAnumber {
    public static void main(String[] args) {
        int n=2282001;
        while (n>0) {
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n/=10;
            
        }
        
    }
}
