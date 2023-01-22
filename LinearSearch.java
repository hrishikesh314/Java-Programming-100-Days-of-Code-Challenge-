public class LinearSearch {
    public static int LinearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
                return -1;
            
        }
            public static void main(String[] args) {
                int numbers[]={2,3,5,34,34,1,10,34,4};
                int key=100;
                int index=LinearSearch(numbers, key);
                if(index==-1){
                    System.out.println("NOT found");

                }else{
                    System.out.println("key is at index :"+ index);
                }
            }
        
    
    
    
}
