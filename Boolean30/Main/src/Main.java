import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a,b,c;
        boolean natija;

        System.out.print("a:");
        a = in.nextInt();
        System.out.print("b:");
        b = in.nextInt();
        System.out.print("c:");
        c = in.nextInt();

        natija = a==b && b==c ;
        System.out.println("a b c tomonli uchburchak teng tomonli?\n"+natija);

    }
}