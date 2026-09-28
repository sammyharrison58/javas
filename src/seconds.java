import java.util.Scanner;

public class seconds {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds :");
        int seconds = input.nextInt();
        int minutes = seconds/60;
        int days = seconds/86400;
        int weeks = days/7;
        System.out.println("seconds:" + seconds +"sec");
        System.out.println("minutes:" + minutes +"mins");
        System.out.println("days:" + days +"days");
        System.out.println("weeks:" + weeks +"weeks");


    }
}
