public class StringConcatenation {
    public static void Concat(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");

        }
    }
    public static void main(String[] args) {
        String FirstName="Hrishikesh";
        String LastName="Sharma";
        String FullName=FirstName+ " " +LastName;
        // System.out.println(FullName.charAt(3));
      Concat(FullName);
    }
}
