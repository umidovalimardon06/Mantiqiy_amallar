import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int x1,y1,x2,y2;
        boolean natija;


        while (true) {

            System.out.print("x1 ni kiriting:");
            x1 = in.nextInt();
            System.out.print("y1 ni kiriting:");
            y1 = in.nextInt();
            System.out.print("x2 ni kiriting:");
            x2 = in.nextInt();
            System.out.print("y2 ni kiriting:");
            y2 = in.nextInt();

            if ((x1!=1 || y1!=1)  || (x2!=1 || y2!=1) ) {
                System.out.println("qabul qilindi");
                break;
            }
            System.out.println("1,1 doskada yoq!");
        }


        natija = (((x1+y1)%2>0) || ((x2+y2)%2>0)  ) ;

        System.out.println("Berilgan maydonlar oq!\n"+natija);


    }
}