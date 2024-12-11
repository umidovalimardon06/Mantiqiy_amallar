import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A,B;
        boolean natija;

        System.out.print("A:");
        A = in.nextInt();
        System.out.print("B:");
        B = in.nextInt();

        natija =( (A%2>0) || (B%2>0) ) ;

        System.out.println("A va B sonlarining hech bo'lmaganda bittasi toq ?\n"+natija);

    }
}