public class ReverseAnArray {
    public static void ReverseAnArray(int numbers[]){
        int first=0,end=numbers.l ength-1;
        while(first<end){
            int temp=numbers[end];
            numbers[end]=numbers[first];
            numbers[first]=temp;
            first++;
            end--;
        }
        
    }
    public static void main(String[] args) {
        int numbers[]={99,88,77,66,55,44,33};
        ReverseAnArray(numbers);
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
