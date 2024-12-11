import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1,num2,num3;
        boolean natija;

        System.out.print("num1:");
        num1 = in.nextInt();
        System.out.print("num2:");
        num2 = in.nextInt();
        System.out.print("num3:");
        num3 = in.nextInt();

        natija = ( (num1!=num2) && (num1!=num3) && (num2!=num3) );

        System.out.println("Berilgan 3 ta sonlarning bari har hil?\n"+natija);
    }
}