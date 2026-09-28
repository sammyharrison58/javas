import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int Number = input.nextInt();
        if (Number % 2 == 0) {
            System.out.println("Even number:" + Number);
        } else {
            System.out.println("Odd number:" + Number);
        }
        ;
    }
}
