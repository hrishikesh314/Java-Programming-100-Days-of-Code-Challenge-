import javax.lang.model.util.ElementScanner14;

public class ShortestPathOfString {
    public static float ShortestPathOfString(String Path){
        int x=0,y=0;
        for(int i=0;i<Path.length();i++){
            char dir=Path.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;

            }
            else if(dir=='E'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2=x*x; 
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    private static void elseif(boolean b) {
    }

    public static void main(String[] args) {
        String Path = "WNEENESENNN";
        System.out.println(ShortestPathOfString(Path));

    }
}
