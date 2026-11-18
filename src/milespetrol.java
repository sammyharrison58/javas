import java.util.Scanner;
public class milespetrol {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the petrol in liters: ");
        int petrol=input.nextInt();
        double distance=petrol*2.65;
        System.out.println("Distance: " + distance);
    }
}
