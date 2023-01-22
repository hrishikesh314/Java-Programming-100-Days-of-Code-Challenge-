public class NoPyramid {
    public static void NoPyramid(int n){
        int No=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(No);
                No++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        NoPyramid(5);
    }
}
