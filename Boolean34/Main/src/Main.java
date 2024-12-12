import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int x,y;
        boolean natija;

        System.out.print("x ni kiriting:");
        x = in.nextInt();
        System.out.print("y ni kiriting:");
        y = in.nextInt();

        if (x==1 && y==1) {
            System.out.println("1,1 doskada yoq!");
            return;
        }

        natija = (x+y)%2>0 ;

        System.out.println("Berilgan maydon oq!\n"+natija);


    }
}