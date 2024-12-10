import java.util.Scanner;
// Umidov Alimardon
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A,B,C;
        boolean natija;

        System.out.print("A ni kiriting:");
        A = in.nextInt();
        System.out.print("B ni kiriting:");
        B = in.nextInt();
        System.out.print("C ni kiriting:");
        C = in.nextInt();

        natija = (A<B) && (B<C);

        System.out.println("B soni A,B orasida ?\n"+natija);

    }
}