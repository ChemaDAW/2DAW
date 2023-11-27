import java.util.*;
public class ejemplo {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String args[]) {
        int x=1;
       while(x<5){
        int y=1;
        do {
            System.out.println(y);
            y++;
        } while (y<x);
        x++;
       }

}
}
