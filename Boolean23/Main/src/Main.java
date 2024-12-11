import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, num3,firstd,lastd;
        boolean natija;

        System.out.print("num1:");
        num1 = in.nextInt();
        System.out.print("num2:");
        num2 = in.nextInt();
        System.out.print("num3:");
        num3 = in.nextInt();

        firstd = num1/100;
        lastd = num3%10;

        natija = (num1 == num3);

        System.out.println("Ushbu sonni chapdan o'nga o'ngdan chapga o'qiganda ham birxil?\n" + natija);
    }
}