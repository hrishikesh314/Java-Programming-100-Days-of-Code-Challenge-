public class binomialCoefficient {
    public static int factorial(int n){
        int f=1;
        for (int i = 1;  i<=n; i++) {
            f=f*i;

            
        }
        return f;
    }
    public static int BiCoeff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_ncr=factorial(n-r);
        int BiCoeff=fact_n/fact_r*fact_ncr;
        return BiCoeff;
    }
    public static void main(String[] args) {
        System.out.println(BiCoeff(6, 4));
    }
}
