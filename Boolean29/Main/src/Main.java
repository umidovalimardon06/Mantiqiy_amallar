import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x,y,x1,y1=0,x2=0,y2;
        boolean natija;

        System.out.print("x:");
        x = in.nextInt();
        System.out.print("y:");
        y = in.nextInt();
        System.out.print("x1:");
        x1 = in.nextInt();
        System.out.print("y2:");
        y2 = in.nextInt();


        natija = (x>x1 && x<0) && (y>y2 && y<0) ;

        System.out.println("...... ichida yotadi?\n"+natija);

    }

}