import java.util.Scanner;
// Umidov Alimardon
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A,B;
        boolean natija;

        System.out.print("A ni kiriting:");
        A = in.nextInt();
        System.out.print("B ni kiriting:");
        B = in.nextInt();

        natija = (A>=0) && (B>-2);

        System.out.println("A>=0 va B>-2 ?\n"+natija);

    }
}