import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class BinarySearch {
    public static int BinarySearch(int numbers[],int key){
        int start=0,end=numbers.length+1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<=key){
                start=mid+1;
            }else{
                end=mid-1;

            }

        }
        return -1;
    }
    public static void main(String[] args) {
       int numbers[]={1,3,4,21,23,53,54,65,75};
       int key=21;
       System.out.println("index for key is "+ BinarySearch(numbers, key));
    }
}
