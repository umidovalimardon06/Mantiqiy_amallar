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

        natija = (A>2) && (B<=3);

        System.out.println("A>2 va B<=3 ?\n"+natija);

    }
}