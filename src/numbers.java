import java.util.Scanner;

public class numbers {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=input.nextInt();
        double square=number*number;
        double cube = number*number*number;
        System.out.println("Square: " + square);
        System.out.println("cube: " + cube);
    }

}
