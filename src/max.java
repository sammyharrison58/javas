import java.util.Scanner;
public class max {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter num1:");
        int Num1= input.nextInt();
        System.out.println("Enter num2:");
        int Num2= input.nextInt();
        System.out.println("Enter num3:");
        int Num3= input.nextInt();
        if(Num1>Num2 && Num1>Num3)
            System.out.println("Maximum:" + Num1);
        else if(Num2>Num1 && Num2>Num3)
            System.out.println("Maximum:" + Num2);
        else
            System.out.println("Maximum:" + Num3);






    }
}
