import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a,b,c;
        boolean natija;

        System.out.print("a(yon tomoni):");
        a = in.nextInt();
        System.out.print("b(yon tomoni):");
        b = in.nextInt();
        System.out.print("c(asosi):");
        c = in.nextInt();

//        c= (int)Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        natija =  c== (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2))  ;
        System.out.println("a b c tomonli uchburchak to'g'ri burchakli?\n"+natija);

    }
}