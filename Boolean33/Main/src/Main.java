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

        natija = (a+b>c) && (b+c>a) && (c+a>b) ;
        System.out.println("a b c tomonli uchburchak yasash mumkun?\n"+natija);

    }
}