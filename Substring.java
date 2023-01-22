public class Substring {
    public static String Substring(String str,int si,int ei){
        String substr="";
        for (int i = 0; i < ei; i++) {
            substr+=str.charAt(i);
            
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(str.substring(0,6));
        System.out.println(Substring(str, 7, 9));
    }
}
