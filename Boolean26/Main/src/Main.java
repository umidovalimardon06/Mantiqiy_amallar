import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x,y;
        boolean natija;

        System.out.print("x:");
        x = in.nextInt();
        System.out.print("y:");
        y = in.nextInt();

        natija = ( (y<0) && (x>0) );

        System.out.println("Kordinatalari(x,y) bo'lgan nuqta kordinatalar " +
                "sistemasining 4-chi choragida yotadi.\n"+natija);


    }
}