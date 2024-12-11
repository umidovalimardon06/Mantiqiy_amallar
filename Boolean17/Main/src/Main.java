import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N;
        boolean natija;

        System.out.print("N ni kiriting:");
        N = in.nextInt();

        natija = N/100>0 && N%2>0 ;

        System.out.println("Berilgan son uch xonali toq son?\n"+natija);

    }
}