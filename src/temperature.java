import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = input.nextInt();
        if (temp > 35) {
            System.out.println("hot");
        } else if (temp == 35) {

            System.out.println("Mid ");
        } else if (temp < 25) {
            System.out.println("cold");

        }
        else{
            System.out.println("Invalid");
        }



    }
}