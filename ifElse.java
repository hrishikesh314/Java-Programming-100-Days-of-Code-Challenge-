public class ifElse {
    public static void main(String[] args) {
        int age=16;
        if (age>18) {
            System.out.println("Adult and You can drive");
        }
        if (age>13 && age<18) {
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}
