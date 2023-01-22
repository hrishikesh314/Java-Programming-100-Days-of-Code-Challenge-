public class invertedNoPyramid {
    public static void invertedNoPyramid(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedNoPyramid(5);
    }
}
     