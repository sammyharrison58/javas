import java.util.Scanner;
public class fournums {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num1: ");
        int num1=input.nextInt();
        System.out.println("Enter a num2: ");
        int num2=input.nextInt();
        System.out.println("Enter a num3: ");
        int num3=input.nextInt();
        System.out.println("Enter a num4: ");
        int num4=input.nextInt();
        int sum=num1+num2+num3+num4;
        double average = sum/4;
        int product=num1*num2*num3*num4;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);

    }
}
