import java.util.Scanner;
// Umidov Alimardon
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A;
        boolean natija;

        System.out.print("A ni kiriting:");
        A = in.nextInt();

        natija = A%2==0;

        System.out.println("A soni juft?\n"+natija);

    }
}