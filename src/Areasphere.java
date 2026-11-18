import java.util.Scanner;
public class Areasphere {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius=input.nextInt();
        double circumference= 4/3*3.14*radius*radius*radius;
        double area=4*3.14*radius*radius;
        System.out.println("circumference: " + circumference);
        System.out.println("Area: " + area);

    }
}
