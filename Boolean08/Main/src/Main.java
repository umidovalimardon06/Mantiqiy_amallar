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
//        System.out.print("C ni kiriting:");
//        C = in.nextInt();

        natija = (A%2>0) && (B%2>0);

        System.out.println("A va B toq sonlar ?\n"+natija);

    }
}