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

        natija = a==b && b==c ;
        System.out.println("a b c tomonli uchburchak teng yonli?\n"+natija);

    }
}