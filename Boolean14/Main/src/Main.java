import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A,B,C;
        boolean natija ;

        System.out.print("A:");
        A = in.nextInt();
        System.out.print("B:");
        B = in.nextInt();
        System.out.print("C:");
        C = in.nextInt();

        natija = ((A>0) && (B<0) && (C<0))  ||  ((A<0) && (B>0) && (C<0))  ||  ((A<0) && (B<0) && (C>0)) ;

        System.out.println("A,B va C sonlarining faqat bittasi musbat?\n"+natija);
    }
}