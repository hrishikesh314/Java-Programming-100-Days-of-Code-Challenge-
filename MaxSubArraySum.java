public class MaxSubArraySum {
    public static void MaxSubarraySum(int numbers[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                curr=0;
                for(int k=start;k<=end;k++){
                    curr=curr+numbers[k];

                }
                System.out.println(curr);
                if(max<curr){
                    max=curr;
                }
            }
        }
        System.out.println("max sum : "+max);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        MaxSubarraySum(numbers);
    }
}
