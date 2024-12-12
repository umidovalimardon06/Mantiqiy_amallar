import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A, B, C,Dis;
        boolean natija;

        System.out.print("A (0 dan farqli):");
        A = in.nextInt();
        System.out.print("B:");
        B = in.nextInt();
        System.out.print("C:");
        C = in.nextInt();

        Dis = ((int)Math.pow(B,2)) - 4*A*C;

        natija = ( (Dis>0) || (Dis == 0) );

        System.out.println("Kvadrat tenglama ildizga ega?\n"+natija);

    }
}